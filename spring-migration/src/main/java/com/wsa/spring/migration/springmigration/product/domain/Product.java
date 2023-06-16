package com.wsa.spring.migration.springmigration.product.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name="product")
class Product {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Column(columnDefinition = "text")
    private String description;

    private BigDecimal price;
}
