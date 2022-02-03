package kg;

import annotations.BankAccount;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

public class BankAccountAssumptionsTest {

  @Test
  @DisplayName("Test will continue, because bank account is not null")
  public void testActiveAssumeTrue() {
    BankAccount bankAccount = new BankAccount(500, -1000);
    assumeTrue(bankAccount != null, "Account is null!");
    assertTrue(bankAccount.isActive());
  }

  @Test
  @DisplayName("Test will be aborted (not failed)")
  public void testActiveAssumeFalse() {
    BankAccount bankAccount = new BankAccount(500, -1000);
    assumingThat(bankAccount != null, () -> assumeFalse(bankAccount != null));
  }
}
