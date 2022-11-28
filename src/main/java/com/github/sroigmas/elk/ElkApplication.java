package com.github.sroigmas.elk;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
@Slf4j
public class ElkApplication {

  public static void main(String[] args) {
    SpringApplication.run(ElkApplication.class, args);
  }

  @Scheduled(fixedRate = 1000)
  public void logMillis() throws InterruptedException {
    log.info("Millis: {}", System.currentTimeMillis());
    Thread.sleep(1000);
  }
}
