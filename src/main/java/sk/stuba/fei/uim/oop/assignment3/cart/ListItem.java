package sk.stuba.fei.uim.oop.assignment3.cart;
import lombok.Getter;
import lombok.Setter;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class ListItem {
    @Id
    private Long productId;
    private int amount;

}
