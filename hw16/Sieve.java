package hw16;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Sieve {

	int limit;
	private Set<Integer> set = new TreeSet<Integer>();
	private ArrayList<Integer> nums = new ArrayList<Integer>();
	
	public Sieve(int upperLimit)
	{
		limit = upperLimit;
	}
	
	public Set<Integer> getPrimes() 
	{
		int p;
		set.clear();
		nums.clear();
		
		for (int i = 2; i <= limit; i++)
			nums.add(i);
		
		while (!nums.isEmpty())
		{
			p = nums.get(0);
			set.add(p);
			nums.remove(0);
			
			for (int i = 0; i < nums.size(); i++)
			{
				if (nums.get(i) % p == 0)
				{
					nums.remove(i);
					i--;
				}
					
			}
		}
		
		
		return set;
	}
	
	public void setUpperLimit(int newLimit) 
	{
		limit = newLimit;
	}
	
	public int primeCount()
	{
		return set.size();
	}
	
}
