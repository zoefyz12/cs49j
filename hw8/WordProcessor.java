package hw8;

public class WordProcessor {

	static final int INITIAL_CAPACITY = 8;
	
	private String[] word;
	
	public WordProcessor()
	{
		word = new String[INITIAL_CAPACITY];
	}
	
	public void add(String toAdd)
	{
		growIfNeeded();
		int counter = 0;
		
		while (word[counter] != null)
		{
			counter++;
		}
		
		word[counter] = toAdd;
	}
	
	public void add(String toAdd, int index)
	{
		growIfNeeded();
		String tem1 = word[index];
		String tem2;
		word[index] = toAdd;
		
		for (int i = index; i < word.length - 1; i ++)
		{
			tem2 = word[i + 1];
			word[i + 1] = tem1;
			tem1 = tem2;
		}
	}
	
	public void removeAdjacentDuplicates()
	{
		String tem = word[0];
		String tem1;
		
		for (int i = 1; i < word.length; i ++)
		{
			if (word[i] == null)
				return;
			
			if (tem == word[i])
			{
				for (int j = i; j < word.length - 1; j++)
				{
					word[j] = word[j + 1];
				}
				
				word[word.length - 1] = null;
				i--;
			}
			else 
			{
				tem = word[i];
			}
		}
	}
	
	private void growIfNeeded()
	{
		boolean isFull = true;
		
		for (int i = 0; i < word.length; i++)
		{
			if (word[i] == null)
				isFull = false;
		}
		
		if (isFull)
		{
			String[] tem = new String[word.length * 2];
			
			for (int i = 0; i < word.length; i++)
			{
				tem[i] = word[i];
			}
			
			word = tem;
		}
	}
	
	public String toString()
	{
		String j = "[" + word[0];
		
		for (int i = 1; i < word.length; i++)
		{
			if (word[i] == null)
				return j + "]";
			
			j += ", " + word[i];
		}
		
		return j + "]";
	}
}
