package com.api.cliente.cliente.configuration;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.api.cliente.cliente"))
				.build()
				.apiInfo(customApiInfo());
	}
	
	private ApiInfo customApiInfo() {
		return new ApiInfo(
				"Api Cliente",
				"Api Cliente",
				"1.0",
				"Terminos del servicio",
				new Contact("Cliente"," ",""),
				"Apache License Version 2.0",
				"https://www.apache.org/licenses/LICENSE-2.0.txt",
				Collections.emptyList());
	}

}
