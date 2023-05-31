package com.wsa.spring.migration.springmigration.product.domain;

import jakarta.persistence.Column;
import lombok.Data;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.annotations.Type;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.type.SqlTypes;

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
