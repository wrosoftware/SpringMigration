package com.wsa.spring.migration.springmigration;

import com.wsa.spring.migration.springmigration.product.ProductApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringMigrationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringMigrationApplication.class, args);
		ProductApi productApi = ctx.getBean(ProductApi.class);
		productApi.getProductNames().forEach(System.out::println);
	}

}
