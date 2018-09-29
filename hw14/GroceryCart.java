package hw14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GroceryCart {

	public static void main(String[] args) throws FileNotFoundException {
		
		double total = 0;
		String line;
		String name;
		String[] lineOfText;
		double price;
		int quantity;
		
		String fileName = "items.txt"; 
		File inputFile = new File(fileName);
		Scanner in = new Scanner(inputFile);
		
		line = in.nextLine();
		
		while (in.hasNextLine())
		{
			line = in.nextLine();
			name = "";
			lineOfText = line.split("\\s+");
			
			quantity = Integer.valueOf(lineOfText[lineOfText.length - 1]);
			price = Double.parseDouble(lineOfText[lineOfText.length - 2]);
			
			for (int i = 0; i < lineOfText.length - 2; i++)
			{
				if (i == lineOfText.length - 3)
				{
					name += lineOfText[i];
				}
				else
				{
					name += lineOfText[i] + " ";
				}                  
			}  
			
			System.out.printf("%-20s %8s %8s %8.2f\n", name, price, quantity, price * quantity);              
			total += price * quantity;
		}
		
		System.out.printf("Total: $%.2f\n",total);
		in.close();   
	}

}
