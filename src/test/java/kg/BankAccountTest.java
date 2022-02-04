package kg;

import annotations.BankAccount;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Test BankAccount Class")
public class BankAccountTest {

  @Test
  @DisplayName("Withdraw successfully")
  public void testValidWithdraw() {
    BankAccount bankAccount = new BankAccount(500, -1000);
    bankAccount.withdraw(300);
    assertEquals(200, bankAccount.getBalance());
  }

  @Test
  @DisplayName("Throw a RuntimeException when withdrawing too much")
  public void testInvalidWithdrawThrowsRuntimeException() {
    BankAccount bankAccount = new BankAccount(500, 0);
    assertThrows(RuntimeException.class, () -> bankAccount.withdraw(1000));
  }

  @Test
  @DisplayName("Deposit successfully")
  public void testDeposit() {
    BankAccount bankAccount = new BankAccount(400, 0);
    bankAccount.deposit(500);
    assertEquals(900, bankAccount.getBalance());
  }

  @Test
  @DisplayName("Balance can become negative")
  public void testWithdrawNotStuckAtZero() {
    BankAccount bankAccount = new BankAccount(500, -1000);
    bankAccount.withdraw(800);
    assertNotEquals(0, bankAccount.getBalance());
  }

  @Test
  @DisplayName("Test activation after creation")
  public void testActive() {
    BankAccount bankAccount = new BankAccount(500, -1000);
    assertTrue(bankAccount.isActive());
  }

  @Test
  @DisplayName("Test set account holder name")
  public void testHolderNameSet() {
    BankAccount bankAccount = new BankAccount(500, -1000);
    bankAccount.setHolderName("Kevin");
    assertNotNull(bankAccount.getHolderName());
  }

  @Test
  @DisplayName("Test set account holder name")
  public void tesDepositAndWithdrawWithoutExceptions() {
    BankAccount bankAccount = new BankAccount(500, -1000);
    assertAll(() -> bankAccount.deposit(200), () -> bankAccount.withdraw(200));
  }

  @Test
  @DisplayName("Test speed of deposit")
  public void testDepositTimeout() {
    BankAccount bankAccount = new BankAccount(500, -1000);
    assertTimeout(Duration.ofNanos(1), () -> bankAccount.deposit(200));
  }
}
