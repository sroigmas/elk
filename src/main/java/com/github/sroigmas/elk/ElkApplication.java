package com.github.sroigmas.elk;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
public class ElkApplication {

  public static void main(String[] args) {
    SpringApplication.run(ElkApplication.class, args);
  }

  @Bean
  CommandLineRunner runner() {
    return args -> {
      for (int i = 0; i < 10; i++) {
        log.info("Log {}", i);
      }
    };
  }
}
