package annotations;

public class BankAccount {
  private double balance;
  private double minimumBalance;

  public BankAccount(double balance, double minimumBalance) {
    this.balance = balance;
    this.minimumBalance = minimumBalance;
  }

  public double withdraw(double amount) {
    if (getBalance() - amount > getMinimumBalance()) {
      balance -= amount;
      return amount;
    } else {
      throw new RuntimeException();
    }
  }

  public double deposit(double amount) {
    return balance += amount;
  }

  public double getBalance() {
    return balance;
  }

  public double getMinimumBalance() {
    return minimumBalance;
  }
}
