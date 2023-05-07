package sk.stuba.fei.uim.oop.assignment3.cart;
import lombok.Getter;
import lombok.Setter;


import javax.persistence.Id;


@Getter
@Setter
public class ListItem {
    @Id
    private Long productId;
    private int amount;

    public ListItem(ListItemRequest itemRequest) {
        this.productId = itemRequest.getProductId();
        this.amount = itemRequest.getAmount();
    }
}
