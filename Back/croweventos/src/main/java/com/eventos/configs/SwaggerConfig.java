package com.eventos.configs;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.tags.Tag;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    public static final String Tag_1 = "Event";

    //Link to access the swagger ui in your browser
    //http://localhost:8080/swagger-ui/
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.eventos"))
                .build();
    }
    @Bean
    public OpenAPI customOpenApi(){
        final Info info = new Info()
                .title("Events API")
                .description("A Rest API for Events with JAVA.")
                .version("1.0.0");

        return new OpenAPI().components(new Components())
                .addTagsItem(createTag(Tag_1,"Rest API for Events"))
                .info(info);
    }

    private Tag createTag(String name, String description) {
        final Tag tag = new Tag();
        tag.setName(name);
        tag.setDescription(description);
        return tag;
    }

}
