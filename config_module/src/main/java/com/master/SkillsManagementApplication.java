package com.master;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.master.*"})
@ComponentScan(basePackages = {"com.master.*"})
@EnableJpaRepositories(basePackages = {"com.master.*"})
public class SkillsManagementApplication {
    public static void main(String[] args) {
        SpringApplication.run(SkillsManagementApplication.class);
    }

}
