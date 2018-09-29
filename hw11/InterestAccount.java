package hw11;

public class InterestAccount extends BankAccount {

	private static final double Interest = 0.00075;
	
	public InterestAccount(double initialBalance, String id) {
		super(initialBalance, id);
	}
	
	public void endOfMonth()
	{
		super.deposit(super.getBalance() * Interest);
	}
}
