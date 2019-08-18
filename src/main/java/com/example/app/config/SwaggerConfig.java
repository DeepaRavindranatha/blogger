package com.example.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.Contact;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.service.ApiInfo;

import static springfox.documentation.builders.PathSelectors.regex;


@EnableSwagger2
@Configuration
public class SwaggerConfig {
	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.example.app"))
				.paths(regex("/rest.*"))
				.build()
        .apiInfo(metaInfo());

	}
	private ApiInfo metaInfo() {

        ApiInfo apiInfo = new ApiInfo(
                "Blogger API",
                "Blogger API for web",
                "1.0",
                "Terms of Service",
                new Contact("Deepa C R","https://www.linkedin.com/in/deepa-ravindranatha-96191a10b/",
                        "deepa@gmail.com"),
                "Apache License Version 2.0",
                "https://www.apache.org/licesen.html"
        );

        return apiInfo;
    }
}
