package fr.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
  @Test
  public void add() {
    assertEquals(5, new Calculator().add(2, 3));
  }
}

