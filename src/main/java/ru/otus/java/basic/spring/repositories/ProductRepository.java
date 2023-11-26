package ru.otus.java.basic.spring.repositories;

import jakarta.annotation.PostConstruct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ru.otus.java.basic.spring.entities.Product;

import java.util.*;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> { // взаимодействие с БД

}
//@Component
//public class ProductRepository {
//    private List<Product> products;
//
//    @PostConstruct
//    public void init() {
//        products = new ArrayList<Product>(Arrays.asList(
//                new Product(1L, "Milk", 80),
//                new Product(2L, "Bread", 20),
//                new Product(3L, "Cheese", 320)
//        ));
//    }
//
//    public List<Product> getAllProducts(){
//        return Collections.unmodifiableList(products);
//    }
//
//    public Product getProductById(Long id) {
//        for (Product p : products ) {
//            if (p.getId().equals(id)) {
//                return p;
//            }
//        }
//        return null;
//    }
//}
