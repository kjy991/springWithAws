package com.yeopking.springwithaws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringWithAwsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringWithAwsApplication.class, args);
    }

}
