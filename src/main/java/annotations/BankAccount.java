package annotations;

public class BankAccount {
  private double balance;
  private double minimumBalance;
  private boolean isActive = true;
  private String holderName;

  public BankAccount(double balance, double minimumBalance) {
    this.balance = balance;
    this.minimumBalance = minimumBalance;
  }

  public String getHolderName() {
    return holderName;
  }

  public void setHolderName(String holderName) {
    this.holderName = holderName;
  }

  public double withdraw(double amount) {
    if (getBalance() - amount > getMinimumBalance()) {
      balance -= amount;
      return amount;
    } else {
      throw new RuntimeException();
    }
  }

  public boolean isActive() {
    return isActive;
  }

  public void setActive(boolean active) {
    isActive = active;
  }

  public double deposit(double amount) {
    return balance += amount;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public double getMinimumBalance() {
    return minimumBalance;
  }
}
