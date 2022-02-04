package kg;

import annotations.BankAccount;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.extension.ExtendWith;
import resolvers.BankAccountParameterResolver;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(BankAccountParameterResolver.class)
public class BankAccountRepeatedTest {

  @RepeatedTest(5)
  @DisplayName("Repeat successful deposits")
  public void testDeposit(BankAccount bankAccount) {
    bankAccount.deposit(500);
    assertEquals(500, bankAccount.getBalance());
  }

  @RepeatedTest(5)
  @DisplayName("Repeat successful deposits with repetition information")
  public void testDepositWithInfo(BankAccount bankAccount, RepetitionInfo repetitionInfo) {
    bankAccount.deposit(500);
    System.out.println(repetitionInfo.getCurrentRepetition());
    assertEquals(500, bankAccount.getBalance());
  }
}
