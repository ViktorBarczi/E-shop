package sk.stuba.fei.uim.oop.assignment3.cart;

public interface ICartService {
    Cart create();

    Cart getShoppingCartById(Long id);

    void deleteShoppingCartById(Long id);

    Cart addProductToCart(Long id, ListItemRequest item);

    String payForShopping(Long id);
}
