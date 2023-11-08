package com.backend.app.mause.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    Docket apiDocket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.backend.app.mause.models.controllers"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(getApiInfo());
		
	}

	private ApiInfo getApiInfo() {
		return new ApiInfo(
				"Mause",
				"Servicio para creacion de mause",
				"1.0.0",
				"Termino de servicios",
				new Contact("Cristopher","https://www.google.com","cristopher.perezbsr@uanl.edu.mx"),
				"LICENSE",
				"LICENSE URL",
				Collections.emptyList()
				);
	}

}
