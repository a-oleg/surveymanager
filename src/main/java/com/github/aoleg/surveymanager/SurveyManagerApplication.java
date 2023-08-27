package com.github.aoleg.surveymanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.github.aoleg.surveymanager.entity")
@EnableJpaRepositories("com.github.aoleg.surveymanager.repository")
public class SurveyManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SurveyManagerApplication.class, args);
    }

}
