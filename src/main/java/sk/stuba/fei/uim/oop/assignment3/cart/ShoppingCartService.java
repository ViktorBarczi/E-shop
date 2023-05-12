package sk.stuba.fei.uim.oop.assignment3.cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sk.stuba.fei.uim.oop.assignment3.exceptions.BadRequestException;
import sk.stuba.fei.uim.oop.assignment3.list.ItemListRepository;
import sk.stuba.fei.uim.oop.assignment3.list.ItemList;
import sk.stuba.fei.uim.oop.assignment3.product.IProductService;
import sk.stuba.fei.uim.oop.assignment3.product.Product;

import java.util.List;


@Service
public class ShoppingCartService implements IShoppingCartService{


    private final IShoppingCartRepository repository;

    @Autowired
    private ItemListRepository itemListRepository;

    @Autowired
    private IProductService productService;

    @Autowired
    public ShoppingCartService(IShoppingCartRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ShoppingCart> getAll() {
        return this.repository.findAll();
    }



    @Override
    public ShoppingCart addToCart(long productId, long cartId, long amount){
        Product product = this.productService.getProduct(productId);
        ShoppingCart c = this.repository.findById(cartId).orElseThrow();
        ItemList itemList = null;
        if (product.getAmount() < amount || c.isPayed()) {
            throw new BadRequestException();
        }

        this.productService.amountDecrease(productId, (int)amount);
        for (ItemList items : c.getShoppingItemList()) {
            if(items.getProdId() == productId) {
                itemList = items;
            }
        }
        if(itemList != null) {
            itemList.setAmount(itemList.getAmount() + amount);
        }
        else {
            itemList = new ItemList();
            itemList.setAmount(amount);
            itemList.setProdId(productId);
            itemList.setCart(c);
            c.getShoppingItemList().add(itemList);
        }
        this.itemListRepository.save(itemList);
        this.repository.save(c);
        return c;
    }

    @Override
    public ShoppingCart createCart() {

        ShoppingCart newC = new ShoppingCart();
        newC.getShoppingItemList().clear();
        newC.setPayed(false);
        return this.repository.save(newC);

    }

    @Override
    public double pay(long id) {
        double p = 0d;
        ShoppingCart shoppingCart = this.repository.findById(id).orElseThrow();
        boolean pay = shoppingCart.isPayed();
        if(!pay) {
            shoppingCart.setPayed(true);
        }else {
            throw new BadRequestException();
        }
        for (ItemList items : shoppingCart.getShoppingItemList()) {
            Product product = this.productService.getProduct(items.getProdId());
            p = p + product.getPrice() * items.getAmount();
        }
        this.repository.save(shoppingCart);
        return p;
    }

    @Override
    public ShoppingCart getAllById(Long id) {
        return this.repository.findById(id).orElseThrow();
    }

    @Override
    public  void deleteCart(Long id) {
        this.repository.findById(id).orElseThrow();
        this.repository.deleteById(id);

    }

}