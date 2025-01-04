package org.openapitools.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SpringDocConfiguration {

    @Bean(name = "org.openapitools.configuration.SpringDocConfiguration.apiInfo")
    OpenAPI apiInfo() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("ValkyrAI CORE API")
                                .description("The API for accessing ValkyrAI services")
                                .termsOfService("https://valkyrlabs.com/tos/")
                                .contact(
                                        new Contact()
                                                .email("info@valkyrlabs.com")
                                )
                                .license(
                                        new License()
                                                .name("AGPL 3.0")
                                                .url("https://www.gnu.org/licenses/agpl-3.0.html")
                                )
                                .version("0.9.25")
                )
                .components(
                        new Components()
                                .addSecuritySchemes("thorapi_auth", new SecurityScheme()
                                        .type(SecurityScheme.Type.OAUTH2)
                                )
                )
        ;
    }
}