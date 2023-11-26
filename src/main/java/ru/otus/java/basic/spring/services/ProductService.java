package ru.otus.java.basic.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.otus.java.basic.spring.entities.Product;
import ru.otus.java.basic.spring.repositories.ProductRepository;

import java.util.List;

@Service
public class ProductService { // основная бизнес - логика
    private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product findProductById(Long id) {
        return productRepository.findById(id).get();
    }

    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

}
