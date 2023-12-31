package sk.stuba.fei.uim.oop.assignment3.cart;

import java.util.List;

public interface IShoppingCartService {
    List<ShoppingCart> getAll();
    ShoppingCart addToCart(long productId, long cartId, long amount);
    ShoppingCart createCart();
    ShoppingCart getAllById(Long id);
    void deleteCart(Long id);
    double pay(long id);
}

