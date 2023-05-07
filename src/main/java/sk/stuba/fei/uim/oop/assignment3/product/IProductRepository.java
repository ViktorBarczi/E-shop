package sk.stuba.fei.uim.oop.assignment3.product;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepository {
    List<Product> findAll();
}
