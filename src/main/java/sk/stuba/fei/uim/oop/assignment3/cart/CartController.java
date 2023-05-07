package sk.stuba.fei.uim.oop.assignment3.cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
public class CartController {
    @Autowired
    private ICartService service;

    /*@PostMapping
    public ResponseEntity<CartResponse> addCart(){
        return new ResponseEntity<>(new CartResponse(this.service.create()), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public CartResponse getShoppingCartById(@PathVariable("id") Long id){
        return new CartResponse(this.service.getShoppingCartById(id));
    }
    @DeleteMapping("/{id}")
    public void deleteShoppingCartById(@PathVariable("id") Long id){
        this.service.deleteShoppingCartById(id);
    }

    @PostMapping("/{id}/add")
    public CartResponse addProductToCart(@PathVariable("id") Long id, @RequestBody ListItemRequest request) {
        return new CartResponse(this.service.addProductToCart(id, request));
    }
    @GetMapping("/{id}/pay")
    public String payForShopping(@PathVariable("id") Long id){
        return this.service.payForShopping(id);
    }*/

}
