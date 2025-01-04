package com.valkyrlabs.api;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.yaml.snakeyaml.Yaml;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

/**
 * ValkyrAI REST Api Service
 */
@SpringBootApplication
@EnableTransactionManagement
@ComponentScan(basePackages = { "com.valkyrlabs.*", "org.openapitools", "org.openapitools.configuration" })
@EntityScan(basePackages = { "com.valkyrlabs.*", "org.openapitools", "org.openapitools.configuration" })
@EnableJpaRepositories(basePackages = { "com.valkyrlabs.*", "org.openapitools", "org.openapitools.configuration" })
// @EnableWebSecurity
@Configuration
@EnableSpringConfigured
// @EnableLoadTimeWeaving(aspectjWeaving = EnableLoadTimeWeaving.AspectJWeaving.ENABLED)
public class ThorApplication {

    protected static final Logger logger = LoggerFactory.getLogger(ThorApplication.class);

    // @Value("${valkyr.service.allowedOrigins}")
    private List<String> allowedOrigins = Arrays.asList("http://localhost:5173",
            "https://loki.valkyrlabs.com", "https://valkyrlabs.com");

    public static void main(String[] args) {
        SpringApplication.run(ThorApplication.class, args);
    }


    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        logger.info("ThorApplication: corsConfigurationSource");
        CorsConfiguration configuration = new CorsConfiguration();

        configuration.setAllowedOrigins(allowedOrigins);
        configuration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "PATCH", "OPTIONS"));

        configuration.setExposedHeaders(Arrays.asList("Authorization", "Origin", "Content-Type", "Accept",
                "Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"));
        configuration.setAllowedHeaders(Arrays.asList("Authorization", "Origin", "Content-Type", "Accept",
                "Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"));

        // configuration.addAllowedOriginPattern("*");
        configuration.setAllowCredentials(true);
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        logger.info("ThorApplication: securityFilterChain");
        http.cors(cors -> cors.configurationSource(corsConfigurationSource()))
                // .cors(cors -> cors.disable()) <<--- does not work as documented
                .csrf(AbstractHttpConfigurer::disable)

                /*
                 * .authorizeHttpRequests((authorize) -> authorize
                 * .anyRequest().authenticated()
                 * )
                 * .httpBasic(Customizer.withDefaults())
                 * .formLogin(Customizer.withDefaults());
                 */

                .authorizeHttpRequests((authorize) -> authorize
                        .anyRequest()
                        .permitAll());

        return http.build();
    }


}
