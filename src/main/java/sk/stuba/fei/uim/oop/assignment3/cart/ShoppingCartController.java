package sk.stuba.fei.uim.oop.assignment3.cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sk.stuba.fei.uim.oop.assignment3.list.ItemListRequest;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cart")
public class ShoppingCartController {

    @Autowired
    private ShoppingCartService service;

    @GetMapping()
    public List<CartResponse> getAllCart() {
        return this.service.getAll().stream().map(CartResponse::new).collect(Collectors.toList());//prechadza cez kazde prvky a zmeni ho na ProductResponse
    }

    @GetMapping("/{id}")
    public CartResponse getAllCartsById(@PathVariable("id") Long id) {
        return new CartResponse(this.service.getAllById(id));
    }

    @GetMapping("/{id}/pay")
    public ResponseEntity<String> payCart(@PathVariable("id") long cartId) {
        String resp = String.valueOf(this.service.pay(cartId));
        return new ResponseEntity<String>(resp, HttpStatus.OK);

    }

    @PostMapping()
    public ResponseEntity<CartResponse> addCart() {
        return new ResponseEntity<>(new CartResponse(this.service.createCart()), HttpStatus.CREATED);
    }

    @PostMapping("/{id}/add")
    public ResponseEntity<CartResponse> addProductToCart(@PathVariable("id") long cartId, @RequestBody ItemListRequest shoppingListRequest) {
        return new ResponseEntity<>(new CartResponse(this.service.addToCart(shoppingListRequest.getProductId(), cartId, shoppingListRequest.getAmount())), HttpStatus.OK);
    }


    @DeleteMapping("/{id}")
    public void deleteCart(@PathVariable("id") Long cartId) {
        this.service.deleteCart(cartId);
    }

}
