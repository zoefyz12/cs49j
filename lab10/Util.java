package hw10;

import java.util.ArrayList;

public class Util {

	public static int min(int[] array)
	{
		int mini = array[0];
		for(int i = 1; i < array.length; i++)
		{
			if (mini > array[i])
			{
				mini = array[i];
			}
		}
		return mini;
	}
	public static boolean contains(String[] array, String letter)
	{          
		for (int i = 0; i < array.length; i++)
		{
			if (letter.equalsIgnoreCase(array[i].substring(0, 1)))
			{
				return true;
			}
			
		}
		return false;
	}

	public static ArrayList<String> contains(ArrayList<String> list, char letter)
	{
		String l = Character.toString(letter);
		ArrayList<String> newlist = new ArrayList<String>();
		for (String w: list)
		{
			if (w.contains(l.toLowerCase()) || w.contains(l.toUpperCase()))
			{
				newlist.add(w);		
			}
		}
		return newlist;		
		
	}
}
