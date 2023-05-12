package sk.stuba.fei.uim.oop.assignment3.product;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductRequest {
    //private Long id;
    private String name;
    private String unit;
    private String description;
    private int amount;
    private double price;
}
