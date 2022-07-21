package com.example.demojunit;

import com.example.demojunit.Class.Caculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class JunitTest {
  private Caculator caculator = new Caculator();

  @Test
  @DisplayName("Simple multiply")
  void testMultiply() {
    Assertions.assertEquals(20, caculator.multiply(5, 4));
  }

  @RepeatedTest(5)
  @DisplayName("Test with zero")
  void testMultiWithZero() {
    Assertions.assertEquals(0, caculator.multiply(0, 6));
    Assertions.assertEquals(0, caculator.multiply(6, 0));
  }

  @Test
  public void testFindMax() {
    Assertions.assertEquals(4, caculator.findMax(new int[] {1, 3, 4, 2}));
    Assertions.assertEquals(-1, caculator.findMax(new int[] {-12, -1, -3, -4, -2}));
  }

  @Test
  public void testThrowPlus() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> caculator.plus(1000, 5));
  }

  @Test
  void testPlus() {
    Assertions.assertEquals(5, caculator.plus(2, 3));
  }
}
