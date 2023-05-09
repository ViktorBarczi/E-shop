package sk.stuba.fei.uim.oop.assignment3.cart;

import java.util.List;

public class CartResponse {
    private Long id;
    private boolean pay;
    private List<ListItem> items;


    public CartResponse(Cart cart){
        this.id = cart.getId();
        this.pay = cart.getPay();
        this.items = cart.getItems();
    }
}
