package com.wsa.spring.migration.springmigration._config.swagger;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@OpenAPIDefinition(
        info = @Info(title = "spring-migration",
                    description = "Demo project for migration to  Spring Boot 3.0.x",
                    version = "1.0.0"),
        security = @SecurityRequirement(name = "JWT", scopes = "global")
)
@SecurityScheme(name = "JWT", type = SecuritySchemeType.HTTP,  scheme = "bearer", bearerFormat = "JWT")
public class SwaggerConfig implements WebMvcConfigurer {

//    @Value("${application.name}")
//    public final String title;
//    @Value("${application.version}")
//    private final String version;
//    @Value("${application.description}")
//    private String description;

//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("swagger-ui.html")
//                .addResourceLocations("classpath:/META-INF/resources/");
//        registry.addResourceHandler("/webjars/**")
//                .addResourceLocations("classpath:/META-INF/resources/webjars/");
//    }

//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addRedirectViewController("/swagger-ui.html", "/swagger-ui/index.html");
//        registry.addRedirectViewController("/swagger-ui", "/swagger-ui/index.html");
//    }

//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.OAS_30)
//                .apiInfo(apiInfo())
//                .directModelSubstitute(LocalDateTime.class, String.class)
//                .directModelSubstitute(LocalDate.class, String.class)
//                .directModelSubstitute(LocalTime.class, String.class)
//                .securitySchemes(asList(apiKey()))
//                .securityContexts(asList(securityContext()))
//                .select()
//                .apis(RequestHandlerSelectors.any())
//                .paths(PathSelectors.any())
//                .build();
//    }
//
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder()
//                .title(title)
//                .version(version)
//                .description(description)
//                .build();
//    }
//
//    private ApiKey apiKey() {
//        return new ApiKey("JWT", "Authorization", "header");
//    }
//
//    private SecurityContext securityContext() {
//        return SecurityContext.builder()
//                .securityReferences(asList(securityReference()))
//                .forPaths(PathSelectors.regex("api/*"))
//                .build();
//    }
//
//    private SecurityReference securityReference() {
//        return SecurityReference.builder()
//                .reference("JWT")
//                .scopes(scopes())
//                .build();
//    }
//
//    private AuthorizationScope[] scopes() {
//        return new AuthorizationScope[]{
//                new AuthorizationScope("global", "global")
//        };
//    }

}
