package kg;

import annotations.BankAccount;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountBeforeAndAfterTest {

  static BankAccount bankAccount;

  @BeforeAll
  public static void beforeAllTestMethods() {
    System.out.println("Before all test methods!");
    bankAccount = new BankAccount(500, 0);
  }

  @AfterAll
  public static void afterAllTestMethods() {
    System.out.println("After all test methods!");
  }

  @BeforeEach
  public void beforeEveryTestMethod() {
    System.out.println("Before each test method!");
  }

  @AfterEach
  public void afterEveryTestMethod() {
    System.out.println("After each test method!");
  }

  @Test
  public void testWithdraw() {
    bankAccount.withdraw(300);
    assertEquals(200, bankAccount.getBalance());
  }

  @Test
  public void testDeposit() {
    bankAccount.deposit(500);
    assertEquals(700, bankAccount.getBalance());
  }
}
