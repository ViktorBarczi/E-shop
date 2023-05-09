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
        return this.repository.findAll();
    }

    @Override
    public Product update(Long id, UpdateRequest request) {
        Product pById = repository.findById(id).orElseThrow();

        pById.setDescription(request.getDescr());
        pById.setName(request.getName());

        return  pById;
    }

    @Override
    public Product getProduct(Long id) {
        return this.repository.findById(id).orElseThrow();
    }

    @Override
    public Product create(ProductRequest requestProduct) {
        Product newProduct = new Product();

        newProduct.setAmount(requestProduct.getAmount());
        newProduct.setId(requestProduct.getId());
        newProduct.setPrice(requestProduct.getPrice());
        newProduct.setName(requestProduct.getName());
        newProduct.setUnit(requestProduct.getUnit());
        newProduct.setDescription(requestProduct.getDescription());

        return this.repository.save(newProduct);
    }



    @Override
    public void delete(Long id) {
        this.repository.delete(this.repository.findById(id).orElseThrow());
    }


    @Override
    public int addAmountToProduct(Long id, AmountRequest requestAmount) {
        Product product = this.repository.findById(id).orElseThrow();
        
        product.setAmount(requestAmount.getAmount());

        return product.getAmount();
    }

    @Override
    public int getAmountFromProduct(Long id) {
        Product product = this.repository.findById(id).orElseThrow();
        return product.getAmount();
    }

}
