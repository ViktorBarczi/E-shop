package sk.stuba.fei.uim.oop.assignment3.product;

import lombok.Getter;

@Getter
public class ProductResponse {

    private Long id;
    private String name;
    private String unit;
    private String description;
    private int amount;
    private double price;


    public ProductResponse(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.unit = product.getUnit();
        this.description = product.getDescription();
        this.amount = product.getAmount();
        this.price = product.getPrice();
    }
}
