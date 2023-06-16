package com.wsa.spring.migration.springmigration.product.domain;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
class ProductController {

    private final ProductService productService;

    @GetMapping("/names")
    public List<String> findAll() {
        return productService.getAllNames();
    }

}
