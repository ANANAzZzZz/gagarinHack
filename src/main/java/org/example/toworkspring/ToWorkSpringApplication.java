package org.example.toworkspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class ToWorkSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(ToWorkSpringApplication.class, args);
    }
}
