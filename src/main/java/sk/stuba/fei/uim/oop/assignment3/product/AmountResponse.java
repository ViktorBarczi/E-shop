package sk.stuba.fei.uim.oop.assignment3.product;

import lombok.Getter;
@Getter
public class AmountResponse {

    private int amount;
    public AmountResponse(int x) {
        this.amount = x;
    }
}
