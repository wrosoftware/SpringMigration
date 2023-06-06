package com.wsa.spring.migration.springmigration._configuration;


import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import javax.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableJpaRepositories("com.wsa.spring.migration")
@ComponentScan("com.wsa.spring.migration")
@EnableAutoConfiguration
//@EnableTransactionManagement(proxyTargetClass = true)
class JpaConfiguration {

    private static final Integer MAX_LIFETIME = 540000;
    private static final int CONNECTION_TIMEOUT_MS = 3000;

//    @Value("${spring.datasource.url}")
//    private String jdbcUrl;
//    @Value("${spring.datasource.username}")
//    private String jdbcUsername;
//    @Value("${spring.datasource.username}")
//    private String jdbcPassword;
//    @Value("${spring.datasource.maxLifetime:54000}")
//    private Integer maxLifetime;
//    @Value("${spring.datasource.maxPoolSize:50}")
//    private Integer maxPoolSize;
//    @Value("${jdbc.minimumPoolSize:10}")
//    private Integer minimumPoolSize;
//    @Value("${spring.datasource.driver-class-name}")
//    String jdbcDriver;
//
//    @Bean
//    public DataSource dataSource() {
//        HikariConfig config = new HikariConfig();
//        config.setMaxLifetime(MAX_LIFETIME);
//        config.setConnectionTimeout(CONNECTION_TIMEOUT_MS);
//        config.setMaximumPoolSize(maxPoolSize);
//        config.setMinimumIdle(minimumPoolSize);
//        config.setJdbcUrl(jdbcUrl);
//        config.setUsername(jdbcUsername);
//        config.setPassword(jdbcPassword);
//        return new HikariDataSource(config);
//    }
//
//    @Bean
//    public PlatformTransactionManager transactionManager(EntityManagerFactory entmanFactory) {
//        JpaTransactionManager txManager = new JpaTransactionManager();
//        Map<String, Object> jpaProperties = new HashMap<>();
//        jpaProperties.put("javax.persistence.lock.timeout", 5000);
//        txManager.setJpaPropertyMap(jpaProperties);
//        txManager.setEntityManagerFactory(entmanFactory);
//        return txManager;
//    }
//
//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
//
//        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//        vendorAdapter.setGenerateDdl(false);
//        vendorAdapter.setShowSql(true);
//        vendorAdapter.setDatabase(Database.valueOf(jdbcDriver));
//
//        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
//        factory.setJpaVendorAdapter(vendorAdapter);
//        factory.setPackagesToScan("incat");
//        factory.setDataSource(dataSource);
//        return factory;
//    }
}
