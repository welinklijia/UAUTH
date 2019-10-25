package com.boco.unitive.rule.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket createRestApi(){
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo()).select().apis(RequestHandlerSelectors.basePackage("com.boco.unitive.rule.blocapi"))
				.paths(PathSelectors.any()).build();
	}
	private ApiInfo apiInfo(){
		return new ApiInfoBuilder().title("统一规则管理v1.0API")
				.description("统一规则管理").termsOfServiceUrl("").contact("boco").version("V1.0").build();
	}
}
