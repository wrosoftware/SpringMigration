package com.wsa.spring.migration.springmigration.product.domain;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public void saveProduct(String productName, String description) {
        Product product = createProduct(productName, description);
        productRepository.save(product);
    }

    public List<String> getAllNames() {
        log.info("getAllNames logging");
        return productRepository.findAll()
                .stream()
                .map(Product::getName)
                .toList();
    }

    private Product createProduct(String productName, String description) {
        Product product = new Product();
        product.setName(productName);
        product.setDescription(description);
        return product;
    }
}
