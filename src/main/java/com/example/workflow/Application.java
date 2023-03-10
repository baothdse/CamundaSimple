package com.example.workflow;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//@EnableScheduling
//@EnableProcessApplication
public class Application {

  public static void main(String... args) {
    SpringApplication.run(Application.class, args);
  }

  @Bean
  @ConditionalOnMissingBean
  public RestTemplate createRestTemplate() {
    RestTemplate restTemplate = new RestTemplate();
    return restTemplate;
  }

}