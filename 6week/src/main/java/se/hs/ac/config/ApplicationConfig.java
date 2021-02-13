package se.hs.ac.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"se.hs.ac.dao", "se.hs.ac.service"})
@Import({DBConfig.class})
public class ApplicationConfig {
}
