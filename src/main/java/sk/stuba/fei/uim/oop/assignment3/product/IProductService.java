package sk.stuba.fei.uim.oop.assignment3.product;


import java.util.List;

public interface IProductService {
    List<Product> getAll();
    Product create(ProductRequest request);
    Product getProduct(Long id);
    Product update(Long id, UpdateRequest request);
    void delete(Long id);
    int getAmountFromProduct(Long id);
    int addAmountToProduct(Long id, AmountRequest requestAmount);

}
