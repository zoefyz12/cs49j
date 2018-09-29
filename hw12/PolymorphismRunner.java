package hw12;

public class PolymorphismRunner {

	public static void main(String[] args)
	   {
			BankAccount b0 = new BankAccount(1000);
			BankAccount b1 = new SavingsAccount(1000, 0.01);
			BankAccount b2 = new CheckingAccount(3000,3);
			BankAccount b3 = new SavingsAccount(1000, 0.01);
			BankAccount b4 = new SavingsAccount(2000, 0.012);
			
			BankAccount account [] = {b0,b1,b2,b3,b4};
			
			for (BankAccount b : account)
			{
				b.deposit(200);
				b.withdraw(100);
				b.endOfMonth();
				System.out.printf("Balance: " + "%.02f", b.getBalance());
				System.out.println();
				if (b  instanceof SavingsAccount)
				{
					System.out.println("Interest: " + ((SavingsAccount) b).getInterestRate());
				}
			}
			
		
	   }
}
