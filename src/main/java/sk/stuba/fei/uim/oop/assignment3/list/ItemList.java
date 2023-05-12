package sk.stuba.fei.uim.oop.assignment3.list;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sk.stuba.fei.uim.oop.assignment3.cart.ShoppingCart;
import sk.stuba.fei.uim.oop.assignment3.cart.ShoppingCart;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
//@Table(name="ShoppingLists")
public class ItemList {

    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JsonIgnore
    //@JoinColumn(name = "cart_id")
    private ShoppingCart cart;

    private long prodId;
    private long amount;
}

