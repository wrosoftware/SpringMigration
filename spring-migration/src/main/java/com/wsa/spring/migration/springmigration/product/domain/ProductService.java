package com.wsa.spring.migration.springmigration.product.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    private final EntityManager em;

    public void saveProduct(String productName, String description) {
        Product product = createProduct(productName, description);
        productRepository.save(product);
    }

    public List<String> getAllNames() {
        return em.createQuery("SELECT p.name FROM Product p")
                .getResultList();
    }

    private Product createProduct(String productName, String description) {
        Product product = new Product();
        product.setName(productName);
        product.setDescription(description);
        return product;
    }
}
