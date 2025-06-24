package com.arithmetic.demo.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArithmeticController {

  @GetMapping("/add")
  public long add(@RequestParam long a, @RequestParam long b) {
    return a + b;
  }
}
