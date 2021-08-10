package com.api.studentteachermanagement.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

	@Bean
	   public Docket scrumAllyApi() {
	       return new Docket(DocumentationType.SWAGGER_2)
	           .select()
	           .paths( PathSelectors.any())
	           .build()
	           .apiInfo(apiInfo());
	   }
	   private ApiInfo apiInfo() {
	       return new ApiInfoBuilder()
	            .title("StudentTeacherManagement")
	            .description("It is Description of School")
	            .build();
	   }
}