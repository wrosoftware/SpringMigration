package com.wsa.spring.migration.springmigration.product.domain;

import com.wsa.spring.migration.springmigration._common.entity.generator.UuidGenerator;
import com.wsa.spring.migration.springmigration._common.entity.type.CustomType;
import com.wsa.spring.migration.springmigration._common.entity.type.UuidType;
import lombok.Data;
import org.hibernate.annotations.GenerationTime;
import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.TypeDef;
import java.math.BigDecimal;
import java.util.UUID;

@Data
@Entity
@Table(name="product")
@TypeDef(name = CustomType.UUID, typeClass = UuidType.class, defaultForType = UUID.class)
class Product {

    @Id
    @GeneratedValue
    private Long id;

    @Type(type = CustomType.UUID)
    @GeneratorType(type = UuidGenerator.class, when = GenerationTime.INSERT)
    private UUID uuid;

    private String name;

    @Type(type = "text")
    private String description;

    private BigDecimal price;
}
