package sk.stuba.fei.uim.oop.assignment3.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService{

    private IProductRepository repository;

    @Autowired
    public ProductService(IProductRepository rep) {
        this.repository = rep;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }

    @Override
    public Product create(ProductRequest request) {
        return null;
    }

    @Override
    public Product getProductsById(Long id) {
        return null;
    }

    @Override
    public Product update(Long id, ProductRequest request) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public int getAmount(Long id) {
        return 0;
    }

    @Override
    public int addAmount(Long id, Amount requestAmount) {
        return 0;
    }
}
