package ru.otus.java.basic.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.otus.java.basic.spring.dto.ProductDTO;
import ru.otus.java.basic.spring.entities.Product;
import ru.otus.java.basic.spring.repositories.ProductRepository;
import ru.otus.java.basic.spring.services.ProductService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ProductController { // ожидает получения запроса
    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    //GET http://localhost:8189/app/api/v1/products/18
    @GetMapping("/api/v1/products/{id}")
    public ProductDTO getProductById(@PathVariable Long id) {
        Product product = productService.findProductById(id);
        return new ProductDTO(product.getTitle(),product.getCost());
//        return productService.findProductById(id);
//    public Product getProductById(@PathVariable Long id) {
//        return productRepository.getProductById(id);
//        return productService.findProductById(id);
    }

    @GetMapping("/api/v1/products/")
    public List<ProductDTO> getAllProduct() {

//       return productRepository.getAllProducts();
        return productService.findAllProducts().stream().map(p -> new ProductDTO(p.getTitle(),p.getCost())).collect(Collectors.toList());
    }
}
