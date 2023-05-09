package sk.stuba.fei.uim.oop.assignment3.cart;

import lombok.Getter;

import java.util.List;

@Getter
public class CartRequest {
    private Long id;
    private boolean pay;
    private List<ListItem> items;
}
