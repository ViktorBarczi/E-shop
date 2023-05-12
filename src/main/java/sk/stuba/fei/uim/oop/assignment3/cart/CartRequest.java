package sk.stuba.fei.uim.oop.assignment3.cart;

import lombok.Getter;
import lombok.Setter;
import sk.stuba.fei.uim.oop.assignment3.list.ItemListResponse;

import java.util.List;

@Setter
@Getter
public class CartRequest {

    private Long id;
    private List<ItemListResponse> product;
    private boolean payed;
}