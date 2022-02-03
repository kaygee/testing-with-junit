package kg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculateMethodsTest {

  private CalculateMethods calculateMethods;

  @BeforeEach
  public void inititalize() {
    calculateMethods = new CalculateMethods();
  }

  @Test
  public void canDivideEvenlyAndPass() {
    assertEquals(10, calculateMethods.divide(100, 10));
  }

  @Test
  public void canThrowArithmeticExceptionWhenDividingByZero() {
    assertThrows(ArithmeticException.class, () -> calculateMethods.divide(100, 0));
  }

  @Test
  public void canAttemptToDivideAndFail() {
    assertNotEquals(11, calculateMethods.divide(100, 10));
  }
}
