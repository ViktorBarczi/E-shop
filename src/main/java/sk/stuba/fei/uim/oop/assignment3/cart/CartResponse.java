package sk.stuba.fei.uim.oop.assignment3.cart;

import lombok.Getter;
import sk.stuba.fei.uim.oop.assignment3.list.ItemList;
import sk.stuba.fei.uim.oop.assignment3.list.ItemListResponse;

import java.util.ArrayList;
import java.util.List;

@Getter
public class CartResponse {


    private Long id;
    private List<ItemListResponse> shoppingList;

    private boolean payed;

    public CartResponse(ShoppingCart c) {
        this.shoppingList = new ArrayList<>();
        this.id = c.getId();
        for(ItemList sL : c.getShoppingItemList()){
            shoppingList.add(new ItemListResponse(sL.getProdId(), sL.getAmount()));
        }
        this.payed = c.isPay();
    }
}
