package sk.stuba.fei.uim.oop.assignment3.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductService service;

    @GetMapping()
    public List<ProductResponse> getAllProducts() {
        return this.service.getAll().stream().map(ProductResponse::new).collect(Collectors.toList());
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public ProductResponse addProduct(@RequestBody ProductRequest request){
        return new ProductResponse(this.service.create(request));
    }

    @GetMapping("/{id}")
    public ProductResponse getProductsById(@PathVariable("id") Long id) {
        return new ProductResponse(this.service.getProduct(id));
    }

    @PutMapping("/{id}")
    public ProductResponse addProduct(@PathVariable("id") Long id, @RequestBody UpdateRequest request){
        return new ProductResponse(this.service.update(id, request));
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Long id){
        this.service.delete(id);
    }


    @GetMapping("/{id}/amount")
    public AmountResponse getAmount(@PathVariable("id") Long id){
        return new AmountResponse(this.service.getAmountFromProduct(id));
    }

    @PostMapping("/{id}/amount")
    public AmountResponse addAmount(@PathVariable("id") Long id, @RequestBody AmountRequest requestAmount){
        return new AmountResponse(this.service.addAmountToProduct(id, requestAmount));
    }
}

