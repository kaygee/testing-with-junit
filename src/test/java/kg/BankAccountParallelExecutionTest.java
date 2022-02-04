package kg;

import annotations.BankAccount;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import resolvers.BankAccountParameterResolver;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Execution(ExecutionMode.CONCURRENT)
@ExtendWith({BankAccountParameterResolver.class})
public class BankAccountParallelExecutionTest {

  @Test
  @DisplayName("Deposit successfully executing in parallel")
  public void testDeposit1(BankAccount bankAccount) {
    try {
      Thread.sleep(500);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    bankAccount.deposit(500);
    assertEquals(500, bankAccount.getBalance());
  }

  @Test
  @DisplayName("Deposit successfully executing in parallel")
  public void testDeposit2(BankAccount bankAccount) {
    try {
      Thread.sleep(500);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    bankAccount.deposit(500);
    assertEquals(500, bankAccount.getBalance());
  }

  @Test
  @DisplayName("Deposit successfully executing in parallel")
  public void testDeposit3(BankAccount bankAccount) {
    try {
      Thread.sleep(500);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    bankAccount.deposit(500);
    assertEquals(500, bankAccount.getBalance());
  }

  @Test
  @DisplayName("Deposit successfully executing in parallel")
  public void testDeposit4(BankAccount bankAccount) {
    try {
      Thread.sleep(500);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    bankAccount.deposit(500);
    assertEquals(500, bankAccount.getBalance());
  }

  @Test
  @DisplayName("Deposit successfully executing in parallel")
  public void testDeposit5(BankAccount bankAccount) {
    try {
      Thread.sleep(500);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    bankAccount.deposit(500);
    assertEquals(500, bankAccount.getBalance());
  }

  @Test
  @DisplayName("Deposit successfully executing in parallel")
  public void testDeposit6(BankAccount bankAccount) {
    try {
      Thread.sleep(500);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    bankAccount.deposit(500);
    assertEquals(500, bankAccount.getBalance());
  }
}
