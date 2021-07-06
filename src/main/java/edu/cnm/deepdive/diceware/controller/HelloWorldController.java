package edu.cnm.deepdive.diceware.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {

  public static final String COMPLIMENT_FORMAT = "Good job in making it to week %d! You know more Java than 99+%%";
  public static final String GREETING_FORMAT = "Hello, %s!";
  public static final String EXPLANATION = "This is a simple Spring MVC-based web service.";

  @GetMapping("greet")
  public String greet(@RequestParam(name = "t", required = false, defaultValue = "world") String target) {

    return String.format(GREETING_FORMAT, target);
  }

  @GetMapping("compliment")
  public String beNice(@RequestParam(name = "w", defaultValue = "5") int week) {

    return COMPLIMENT_FORMAT;

  }

  @GetMapping
  public String explain() {
    return EXPLANATION;
  }

}
