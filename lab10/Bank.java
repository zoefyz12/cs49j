package hw10;

import java.util.ArrayList;

public class Bank {
	private ArrayList<BankAccount> bank;
	
	public Bank()
	{
		bank = new ArrayList<BankAccount>();
	}
	
	public void add(BankAccount b)
	{
		bank.add(b);
	}
	
	public ArrayList<BankAccount> largestFirst ()
	{
		if (bank.size() == 0)
		{
			return null;
		}
		double largest = bank.get(0).getBalance();
		int j = 0;
		for (int i = 0; i < bank.size(); i++)
		{
			if (largest < bank.get(i).getBalance())
			{
				largest = bank.get(i).getBalance();
				j = i;
			}
		}
		bank.set(0, bank.get(j));
		return bank;
	}
	public void list ()
	{
	}

}
