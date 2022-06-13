package com.progra3.petstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootApplication
public class PetStoreApplication {



	public static void main(String[] args) {
		SpringApplication.run(PetStoreApplication.class, args);
	}
	@Bean
	public Docket api(){
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.progra3.petstore"))
				.build()
				.apiInfo(ApiDetails());


	}
	public ApiInfo ApiDetails(){
		return new ApiInfoBuilder()
				.title("Examen Final de Programacion 3")
				.contact(new Contact("Jeanette Mariana Reyes Valenzuela", "no-url", "marianareyes9@gmail.com" ))
				.description("Api realizada, con el fin de registrar nombres de animales, precio, etc.")
				.build();
	}

}