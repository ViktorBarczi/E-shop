package sk.stuba.fei.uim.oop.assignment3.cart;

import org.springframework.stereotype.Service;

@Service
public class CartService implements ICartService{
    @Override
    public Cart create() {
        return null;
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
