package sk.stuba.fei.uim.oop.assignment3.product;


import sk.stuba.fei.uim.oop.assignment3.amount.AmountRequest;
import sk.stuba.fei.uim.oop.assignment3.amount.AmountResponse;

import java.util.List;

public interface IProductService {
    List<Product> getAll();
    Product createNewProduct(ProductRequest request);
    Product getProduct(Long id);
    Product updateProduct(Long id, ProductRequest request);
    void deleteProduct(Long id);
    int getAmountFromProduct(Long id);
    AmountResponse addAmountToProduct(Long id, AmountRequest request);
    void amountDecrease(Long id, int amount);

}
