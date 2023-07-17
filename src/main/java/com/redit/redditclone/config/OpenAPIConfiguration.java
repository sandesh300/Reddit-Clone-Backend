package com.redit.redditclone.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class OpenAPIConfiguration {

    @Bean
    public OpenAPI expenseAPI()
    {
        return new OpenAPI()
                .info(new Info().title("Reddit Clone API")
                .description("API for reddit clone application")
                        .version("v0.0.1")
                        .license(new License().name("Apache licence version 2.0").url("http://reditclone.com")))
                                .externalDocs(new ExternalDocumentation()
                          .description("Expense tracker wiki Documentation")
                                        .url("https://expensetracker.wiki/docs"));
    }
}
