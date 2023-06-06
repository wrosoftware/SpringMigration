package com.wsa.spring.migration.springmigration.product.domain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ProductRepositoryTest {

    @Autowired
    private ProductRepository repository;
    @Autowired
    private EntityManager em;

    @Test
    void shouldSaveOnDB() {
        Product product = new Product();
        product.setName("test_1");
        repository.save(product);

        Product saved = (Product) em.createQuery("FROM Product p WHERE p.id = :id")
                .setParameter("id", product.getId())
                .getSingleResult();
        assertThat(saved).isNotNull();
        assertThat(saved.getName()).isEqualTo(product.getName());
    }
}
