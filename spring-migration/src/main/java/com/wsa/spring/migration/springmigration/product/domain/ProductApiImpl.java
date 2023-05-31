package com.wsa.spring.migration.springmigration.product.domain;

import com.wsa.spring.migration.springmigration.product.ProductApi;
import jakarta.annotation.PostConstruct;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Transactional
@RequiredArgsConstructor
class ProductApiImpl implements ProductApi {

    private final ProductService productService;

    @PostConstruct
    private void init() {
        productService.saveProduct("product_name_1", "description1");
        productService.saveProduct("product_name_2", "description2");
    }

    @Override
    public List<String> getProductNames() {
        return productService.getAllNames();
    }
}
