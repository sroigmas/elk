package com.github.sroigmas.elk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  @GetMapping
  public String get() {
    return "Hello world!";
  }
}
