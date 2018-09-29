package hw13;

public class Snack extends Product implements Cloneable,  Comparable{

	private int gramsOfFat;
	
	public Snack(String theDescription, double thePrice, int fat) {
		super(theDescription, thePrice);
		gramsOfFat = fat;
	}
	
	public int getGramsOfFat()
	{
		return gramsOfFat;
	}
	
	public boolean isHealthier(Snack s)
	{
		if (gramsOfFat < s.getGramsOfFat())
			return true;
		else
			return false;
	}

	public String toString()
	{
		String s = "Snack[description=";
		s += super.getDescription() + ",price=" + super.getPrice() + "][gramsOfFat=" + gramsOfFat + "]";
		
		return s;
	}
	
	public boolean equals(Object otherObject)
	{
		if (otherObject == null)
			return false;
		if (this.getClass() != otherObject.getClass())
			return false;
		
		Snack other = (Snack)otherObject;
	    return (super.getDescription() == other.getDescription() && super.getPrice() == other.getPrice() && gramsOfFat == other.getGramsOfFat());
	}
	
	public int compareTo(Object otherObject) 
	{
		Snack other = (Snack) otherObject;
		
		if (gramsOfFat == other.getGramsOfFat())
		{
			if (super.getPrice() == other.getPrice())
			{
				return super.getDescription().compareTo(other.getDescription());
			}
			else
			{
				if (super.getPrice() > other.getPrice())
					return 1;
				else
					return -1;
			}
		}
		else
		{
			if (gramsOfFat > other.getGramsOfFat())
				return 1;
			else
				return -1;
		} 
	}
	
	public Object clone()
	{
		try
		{
			Snack cloned = (Snack) super.clone();
			//cloned.getDescription() = (BankAccount) account.clone();
			
			return cloned;
		}
		catch(CloneNotSupportedException e)
		{ // Can¡¯t happen because we implement Cloneable
			return null;
		}
	}
}
