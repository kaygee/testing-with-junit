package kg;

import annotations.BankAccount;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;
import resolvers.BankAccountParameterResolver;

import java.time.DayOfWeek;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(BankAccountParameterResolver.class)
public class BankAccountParameterizedTest {

  @ParameterizedTest
  @ValueSource(ints = {100, 400, 800, 1000})
  @DisplayName("Repeat successful deposits using parameters")
  public void testDeposit(int amount, BankAccount bankAccount) {
    bankAccount.deposit(amount);
    assertEquals(amount, bankAccount.getBalance());
  }

  @ParameterizedTest
  @EnumSource(
      value = DayOfWeek.class,
      names = {"TUESDAY", "THURSDAY"})
  @DisplayName("Parameterized test using enumeration")
  public void testDayOfWeek(DayOfWeek dayOfWeek) {
    assertTrue(dayOfWeek.toString().startsWith("T"));
  }

  @ParameterizedTest
  @CsvSource({"100, Mary", "200, Bob", "1, Kevin"})
  @DisplayName("Repeat successful deposits using parameters")
  public void depositAndNameTest(double amount, String name, BankAccount bankAccount) {
    bankAccount.deposit(amount);
    bankAccount.setHolderName(name);
    assertEquals(amount, bankAccount.getBalance());
    assertEquals(name, bankAccount.getHolderName());
  }
}
