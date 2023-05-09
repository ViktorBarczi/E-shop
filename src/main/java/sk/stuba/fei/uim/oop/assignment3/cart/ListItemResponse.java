package sk.stuba.fei.uim.oop.assignment3.cart;

import lombok.Getter;

@Getter
public class ListItemResponse {
    private Long productId;
    private int amount;

    public ListItemResponse(ListItemRequest itemRequest) {
        this.productId = itemRequest.getProductId();
        this.amount = itemRequest.getAmount();
    }
}
