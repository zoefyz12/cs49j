package hw11;

public class TransactionAccount extends BankAccount{

	private final static double Transaction_Fee = 5.0;
	public final static int FREE_TRANSACTIONS = 4;
	private int counter;
	
	public TransactionAccount(double initialBalance, String id) {
		super(initialBalance, id);
		counter = 0;
	}

	 public void deposit(double amount)
	 {  
	        super.deposit(amount);
	        counter++;
	 }
	 
	 public void withdraw(double amount)
	 {   
	       super.withdraw(amount);
	       counter++;
	 }
	 
	 public void endOfMonth()
	 {
		 if (counter > FREE_TRANSACTIONS)
		 {
			 super.withdraw((counter - 4) * Transaction_Fee);
		 }
	 }
}
