package hw15;

import java.util.LinkedList;

public class LinkedListUtil {

	public static void shrink(LinkedList<String> strings, int n) 
	{
		int numOfN = strings.size() / n;
		
		for (int i = numOfN; i > 0; i--)
		{
			strings.remove(n * i - 1);
		}
	}
	
	public static LinkedList<String> reverse(LinkedList<String> strings)
	{
		LinkedList<String> reverse = new LinkedList<>();
		
		for (int i = strings.size() - 1; i >= 0; i--)
		{
			reverse.add(strings.get(i));
		}
		
		return reverse;
	}
}
