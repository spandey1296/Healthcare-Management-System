package com.project.healthcaremanagement.config;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Configuration
 @EnableSwagger2
 @ConfigurationProperties("app.api")
 @ConditionalOnProperty(name="app.api.swagger.enable", havingValue = "true", matchIfMissing = false)
 public class SwaggerConfig {


	@Bean
	public Docket api() {
            		return new Docket(DocumentationType.SWAGGER_2)
            			.select()
            			.apis(RequestHandlerSelectors.basePackage("com.project.healthcaremanagement.controller"))
            			.paths(PathSelectors.any())
            			.build()
            			.directModelSubstitute(LocalDate.class, java.sql.Date.class)
            			.directModelSubstitute(LocalDateTime.class, java.util.Date.class)
            			.apiInfo(apiInfo());
            	}

        private ApiInfo apiInfo() {
            	return new ApiInfoBuilder()
            		.title("Health")
            		.description("Health Care  Management System")
						.version("1.0")
            		.contact(new Contact("Shivant", "spandey1296.github.io", "shivant47@gmail.com")).build();
            	}

    }