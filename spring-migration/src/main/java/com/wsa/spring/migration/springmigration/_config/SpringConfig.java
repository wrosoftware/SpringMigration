package com.wsa.spring.migration.springmigration._config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.beans.JavaBean;
import java.net.http.HttpClient;

@Configuration
public class SpringConfig {

    @Bean
    RestTemplate restTemplate() {
        HttpClient client = HttpClients.custom()
                .setSSLContext(buildSslContext())
                .setDefaultRequestConfig(RequestConfig.custom()
                        .setConnectTimeout(3000)
                        .setCookieSpec(StandardCookieSpec.STRICT)
                        .build())
                .build();
        return new RestTemplate(client);
    }

}
