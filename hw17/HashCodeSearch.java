package hw17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class HashCodeSearch {

	public static void main(String[] args) throws FileNotFoundException
	{
		int hashCode;
		String identifier = "";
		int numWord = 0;
		int duplicates  = 0;
		
		Map<Integer, HashSet<String>> hash= new HashMap<Integer, HashSet<String>>();
		
		String filename = "war_and_peace.txt"; 
		
		File file = new File(filename);
		Scanner scanner = new Scanner(file);
		scanner.useDelimiter("[^A-Za-z0-9_]+");
		
		while (scanner.hasNext()) 
		{         
			numWord++;
			identifier = scanner.next();
			hashCode = identifier.hashCode();
				
			if (hash.containsKey(hashCode))
			{
				HashSet<String> s = hash.get(hashCode);
				s.add(identifier);
				hash.put(hashCode, s);
			}
			else
			{
				HashSet<String> list = new HashSet<String>();
				list.add(identifier);
				hash.put(hashCode, list);
			}	
		}	
		
		Iterator<Integer> itr = hash.keySet().iterator();
		
		while (itr.hasNext()) 
		{
			Integer h = itr.next();
			HashSet s = hash.get(h);
			if (s.size() > 1)
			{
				duplicates++;
				System.out.println(new TreeSet(s));
			}
		}
		
		
		double a = (double)duplicates/(double)numWord;
		System.out.println(a);
	}
}
