package com.example.mySpringProject.controller;

import java.time.LocalDateTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/helloworld")
  public String helloWorld() {
    return "Hello World!";
  }

  @GetMapping("/now")
  public String localDateTime() {
    LocalDateTime dateTime = LocalDateTime.now();
    return dateTime.toString();
  }
}