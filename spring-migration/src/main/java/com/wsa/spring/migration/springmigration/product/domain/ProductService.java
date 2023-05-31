package com.wsa.spring.migration.springmigration.product.domain;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.wsa.spring.migration.springmigration.product.domain.QProduct.product;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    private final JPAQueryFactory jpaQueryFactory;

    public void saveProduct(String productName, String description) {
        Product product = createProduct(productName, description);
        productRepository.save(product);
    }

    public List<String> getAllNames() {
        return jpaQueryFactory.select(product)
                .from(product)
                .orderBy(product.name.desc())
                .fetch()
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
