package com.wsa.spring.migration.springmigration._config.swagger;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
//@OpenAPIDefinition(
//        info = @Info(title = "spring-migration",
//                    description = "Demo project for migration to  Spring Boot 3.0.x",
//                    version = "1.0.0"),
//        security = @SecurityRequirement(name = "JWT", scopes = "global")
//)
//@SecurityScheme(name = "JWT", type = SecuritySchemeType.HTTP,  scheme = "bearer", bearerFormat = "JWT")
public class SwaggerConfig implements WebMvcConfigurer {

    @Value("${application.name}")
    public String title;

    @Value("${application.version}")
    private String version;
    @Value("${application.description}")
    private String description;

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new io.swagger.v3.oas.models.info.Info()
                        .title(title)
                        .version(version)
                        .description(description))

                .components(new Components()
                        .addSecuritySchemes("JWT",
                                new io.swagger.v3.oas.models.security.SecurityScheme()
                                        .type(io.swagger.v3.oas.models.security.SecurityScheme.Type.HTTP)
                                        .scheme("bearer")
                                        .bearerFormat("JWT")));
    }

}
