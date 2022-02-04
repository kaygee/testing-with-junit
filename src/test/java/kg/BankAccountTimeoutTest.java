package kg;

import annotations.BankAccount;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.ExtendWith;
import resolvers.BankAccountParameterResolver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

@ExtendWith(BankAccountParameterResolver.class)
public class BankAccountTimeoutTest {

  @Test
  @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
  @DisplayName("Deposit successfully within timeout")
  public void testDepositWithTimeoutOnTest(BankAccount bankAccount) {
    bankAccount.deposit(500);
    assertEquals(500, bankAccount.getBalance());
  }

  @Test
  @DisplayName("Deposit successfully within timeout")
  public void testDepositWithTimeoutOnMethod(BankAccount bankAccount) {
    bankAccount.deposit(500);
    assertTimeout(Duration.ofMillis(500), () -> bankAccount.getBalance());
  }
}
