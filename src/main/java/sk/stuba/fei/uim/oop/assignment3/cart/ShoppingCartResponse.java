package sk.stuba.fei.uim.oop.assignment3.cart;

import lombok.Getter;
import sk.stuba.fei.uim.oop.assignment3.list.ItemList;
import sk.stuba.fei.uim.oop.assignment3.list.ItemListResponse;

import java.util.ArrayList;
import java.util.List;

@Getter
public class ShoppingCartResponse {


    private Long id;
    private List<ItemListResponse> shoppingList;

    private boolean payed;

    public ShoppingCartResponse(ShoppingCart c) {
        this.id = c.getId();
        this.shoppingList = new ArrayList<>();
        this.payed = c.isPayed();
        for(ItemList iList : c.getShoppingItemList()){
            ItemListResponse newItem = new ItemListResponse(iList.getProdId(), iList.getAmount());
            shoppingList.add(newItem);
        }
    }
}