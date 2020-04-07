package kz.iitu.libraryjpa.librarymanagement.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "kz.iitu.libraryjpa.librarymanagement.config")
@PropertySource("application.properties")
public class SpringConfig {
}
