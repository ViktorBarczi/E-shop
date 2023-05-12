package sk.stuba.fei.uim.oop.assignment3.list;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;

@Getter
@Setter
@NoArgsConstructor
@Embeddable
public class ItemListResponse {

    private Long productId;
    private Long amount;

    public ItemListResponse(Long productId, Long amount) {
        this.productId = productId;
        this.amount = amount;
    }
}
