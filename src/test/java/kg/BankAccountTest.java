package kg;

import annotations.BankAccount;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Test BankAccount Class")
public class BankAccountTest {

  @Test
  @DisplayName("Withdraw $500 successfully")
  public void testValidWithdraw() {
    BankAccount bankAccount = new BankAccount(500, -1000);
    bankAccount.withdraw(300);
    assertEquals(200, bankAccount.getBalance());
  }

  @Test
  @DisplayName("Throw a RuntimeException if we try to withdraw too much")
  public void testInvalidWithdrawThrowsRuntimeException() {
    BankAccount bankAccount = new BankAccount(500, 0);
    assertThrows(RuntimeException.class, () -> bankAccount.withdraw(1000));
  }

  @Test
  @DisplayName("Deposit $400 successfully")
  public void testDeposit() {
    BankAccount bankAccount = new BankAccount(400, 0);
    bankAccount.deposit(500);
    assertEquals(900, bankAccount.getBalance());
  }
}
