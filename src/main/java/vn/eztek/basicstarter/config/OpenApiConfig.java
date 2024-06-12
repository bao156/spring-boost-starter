package vn.eztek.basicstarter.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.security.SecurityScheme.In;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

  @Bean
  public GroupedOpenApi api() {
    return GroupedOpenApi.builder()
        .group("spring-boot-basic-starter")
        .pathsToMatch("/api/**")
        .build();
  }

  @Bean
  public OpenAPI springShopOpenAPI() {
    return new OpenAPI()
        .info(new Info().title("Spring Boot Basic Starter REST API")
            .description("Some custom description of API.")
            .version("v1.0.0")
            .license(new License().name("License of API").url("API license URL")))
        .components(createComponents())
        .addSecurityItem(new SecurityRequirement().addList("JWT"));
  }

  private Components createComponents() {
    var components = new Components();
    components.addSecuritySchemes("JWT", createSecurityScheme());

    return components;
  }

  private SecurityScheme createSecurityScheme() {
    return new SecurityScheme()
        .name("Authorization")
        .type(SecurityScheme.Type.APIKEY)
        .in(In.HEADER)
        .scheme("apiKey");
  }

}
