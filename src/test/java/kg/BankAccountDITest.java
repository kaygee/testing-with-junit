package kg;

import annotations.BankAccount;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import resolvers.BankAccountParameterResolver;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(BankAccountParameterResolver.class)
public class BankAccountDITest {

  @Test
  @DisplayName("Deposit successfully")
  public void testDeposit(BankAccount bankAccount) {
    bankAccount.deposit(500);
    assertEquals(500, bankAccount.getBalance());
  }
}
