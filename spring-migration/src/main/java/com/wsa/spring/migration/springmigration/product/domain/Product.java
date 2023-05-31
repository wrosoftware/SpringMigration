package com.wsa.spring.migration.springmigration.product.domain;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Data
@Entity
@Table(name="product")
class Product {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Type(type = "text")
    private String description;

    private BigDecimal price;
}
