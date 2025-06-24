package com.arithmetic.demo.endpoint;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArithmeticControllerTest {
  ArithmeticController arithmeticController = new ArithmeticController();

  @Test
  void test_add_ok() {
    assertEquals(7, arithmeticController.add(3, 4));
  }

  @Test
  void test_add_long_numbers_ok() {
    assertEquals(100_000_000_000L, arithmeticController.add(50_000_000_000L, 50_000_000_000L));
  }
}
