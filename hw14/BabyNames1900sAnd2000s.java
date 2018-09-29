package hw14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class BabyNames1900sAnd2000s {

	public static void main(String[] args) throws FileNotFoundException
	{
		if (args.length < 1)
		{
			System.out.println("Usage: java BabyNames1900sAnd2000s file1 file2");
			return;
		}
		
		String line;
		String[] lineOfText;
		ArrayList<String> boyName1900 = new ArrayList<String>();
		ArrayList<String> girlName1900 = new ArrayList<String>();
		ArrayList<String> boyName2000 = new ArrayList<String>();
		ArrayList<String> girlName2000 = new ArrayList<String>();
		ArrayList<String> boy = new ArrayList<String>();
		ArrayList<String> girl = new ArrayList<String>();
		
		
		String file1 = args[0];
		String file2 = args[1];
		//String file1 = "babynames1900s.txt";
		//String file2 = "babynames2000s.txt";
	
		File inputFile1 = new File(file1);
		File inputFile2 = new File(file2);
		Scanner in1 = new Scanner(inputFile1);
		Scanner in2 = new Scanner(inputFile2);
		
		line = in1.nextLine();
		line = in1.nextLine();
	
		while (in1.hasNextLine())
		{
			line = in1.nextLine();
			lineOfText = line.split("\\s+");
			boyName1900.add(lineOfText[1]);
			girlName1900.add(lineOfText[3]);
		}
		
		line = in2.nextLine();
		line = in2.nextLine();
	
		while (in2.hasNextLine())
		{
			line = in2.nextLine();
			lineOfText = line.split("\\s+");
			boyName2000.add(lineOfText[1]);
			girlName2000.add(lineOfText[3]);
		}
		
		//in1.close();
		//in2.close();
		
		for (int i = 0; i < boyName1900.size(); i++)
		{
			if (boyName2000.contains(boyName1900.get(i)))
				boy.add(boyName1900.get(i));
		}
		
		for (int i = 0; i < girlName1900.size(); i++)
		{
			if (girlName2000.contains(girlName1900.get(i)))
				girl.add(girlName1900.get(i));
		}
		
		boy.sort(String::compareToIgnoreCase);
		girl.sort(String::compareToIgnoreCase);
		
		for (int i = 0; (i < boy.size()) || (i < girl.size()); i++)
		{
			if (i < boy.size())
				System.out.print(String.format("%-30s", boy.get(i)));

			if (i < girl.size())
				System.out.print(String.format("%-30s\n", girl.get(i)));
			else
				System.out.print("\n");
	       }
	}
}
