package com.wsa.spring.migration.springmigration.product._config.querydsl;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;

@Configuration
class QueryDslConfig {

    @Bean
    public JPAQueryFactory getJPAQueryFactory(EntityManager entityManager){
        return new JPAQueryFactory(entityManager);
    }
}
