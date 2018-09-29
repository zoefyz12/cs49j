package hw12;

/**
* An account that earns interest every month
*/
public class SavingsAccount extends BankAccount
{
  private double annualInterestRate;
 
  /**
   * Creates a InterestAccount object with a starting balance and account id
   * @param initialBalance the starting balance
   * @param rate the annual interest rate
   */
  public SavingsAccount(double initialBalance, double rate)
  {
      super(initialBalance);
      annualInterestRate = rate;
  }
  
  public double getInterestRate()
  {
     return annualInterestRate;
  }
  
  @Override
  public void endOfMonth()
  {
      double interest = getBalance() * annualInterestRate / 100 /12;
      deposit(interest);
  }
  @Override
  public String toString()
  {
      String s = "SavingsAccount[balance=" + super.getBalance() + "][anualInterstRate=" + getInterestRate() + "]";
      return s;
  }
  @Override
  public boolean equals(Object otherObject)
  {
    if (otherObject == null)
      return false;
    if (this.getClass() != otherObject.getClass())
      return false;
    SavingsAccount other = (SavingsAccount)otherObject;
    return (super.getBalance()== other.getBalance() && getInterestRate() == other.getInterestRate());
  } 
}