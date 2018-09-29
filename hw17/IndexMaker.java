package hw17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class IndexMaker {

	public static void main(String[] args) throws FileNotFoundException
	{
		ArrayList reserved = new ArrayList();
		String reservedFile = "reserved.txt";
		String word;
		String identifier = "";
		int line = 1;
		
		HashMap<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();
		
		File res = new File(reservedFile);
		Scanner in = new Scanner(res);
		
		word = in.nextLine();
		reserved.add(word);
		
		while (in.hasNextLine())
		{
			word = in.nextLine();
			reserved.add(word);
		}
		
		in.close();
		
		String filename = "ProcessRectangle.java"; //SUB "PaintJobCalculator.java"
		Scanner scan = new Scanner(new File(filename), "UTF-8");
	
		while (scan.hasNextLine())
		{
			Scanner scanner = new Scanner(scan.nextLine());
			scanner.useDelimiter("[^A-Za-z_]+");
		
			while (scanner.hasNext()) 
			{                    
				identifier = scanner.next();
				
				if (!reserved.contains(identifier))
				{
					if (map.containsKey(identifier))
					{
						if (!map.get(identifier).contains(line))
							map.get(identifier).add(line);
					}
					else
					{
						ArrayList<Integer> list = new ArrayList<Integer>();
						list.add(line);
						map.put(identifier, list);
					}	
				}	
			}	
			
			line++;
		}
		
		SortedSet<String> keys = new TreeSet<String>(map.keySet());
		
		for (String key : keys) { 
			ArrayList<Integer> value = map.get(key);

			System.out.println(key + ": " + value);
		}
	}
}
