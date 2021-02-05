package org.faylinn.rpm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "org.faylinn.rpm.persistence.mapper")
@SpringBootApplication
public class ApiRpmApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiRpmApplication.class, args);
    }

}
