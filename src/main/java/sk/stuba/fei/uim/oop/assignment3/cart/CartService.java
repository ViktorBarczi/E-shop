package sk.stuba.fei.uim.oop.assignment3.cart;

import org.springframework.stereotype.Service;
import sk.stuba.fei.uim.oop.assignment3.product.Product;

@Service
public class CartService implements ICartService{

    private ICartRepository repository;

    @Override
    public Cart create() {
        Cart newCart = new Cart();
        return this.repository.save(newCart);
    }

    @Override
    public Cart getShoppingCartById(Long id) {
        return null;
    }

    @Override
    public void deleteShoppingCartById(Long id) {

    }

    @Override
    public Cart addProductToCart(Long id, ListItemRequest item) {
        return null;
    }

    @Override
    public String payForShopping(Long id) {
        return null;
    }
}
