package hw14;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CEOSalaries
{
   public static void main(String[] args)
   {
	   if (args.length < 1)
	   {
		   System.out.println("Usage: java CEOSalaries infile");
		      return;
	   }
	   
      File inputFile = new File(args[0]);
      try(Scanner in = new Scanner(inputFile, "UTF-8");)
      {
    	  int count = 0;
			 double total = 0.0;
    	  while (in.hasNextLine())
	      {
	        
			 String line = in.nextLine();
			 
			 if (Character.isDigit(line.charAt(line.length() - 1)))
			 { 
			 int i = 0;
			 while (!Character.isWhitespace(line.charAt(i))) { i++; }
			 
			 String ticker = line.substring(0, i);
			 ticker = ticker.trim();
			 while (!Character.isDigit(line.charAt(i)))
			 {
				 i++;
			 }
			 String number = line.substring(i+4);
			 
			 number = number.trim();
			 String c = number;
			 number = number.replace("$", "");
			 number = number.replace(",", "");
			 int compensation1 = Integer.parseInt(number);
			 total = total + compensation1;
			 int j = i;
			 while (!Character.isAlphabetic(line.charAt(j)))
			 {
				 j--;
			 }
			 while (!Character.isWhitespace(line.charAt(j)))
			 {
				 j--;
			 }
			 int k = j-1;
			 while (!Character.isWhitespace(line.charAt(k)))
			 {
				 k--;
			 }
			 j = k;
			 while (!Character.isWhitespace(line.charAt(j-2)))
			 {
				 j--;
			 }
			 String name = line.substring(j-1,i);
			 String name2 = line.substring(k,i);
			 name =  name.trim();
			 name2 = name2.trim();
			 
			 if (name.contains("."))
			 {
				 System.out.printf("%s: %s %s\n", ticker, name, c);
			 }
			 else
				 System.out.printf("%s: %s %s\n",ticker, name2, c);
			 count++; 
			 }	 
	      }
    	  DecimalFormat df = new DecimalFormat("##,###,###.00");
          
		 System.out.println("Average salary: $" + df.format(total/count));
      in.close();
      }
      catch(FileNotFoundException e)
      {
    	  System.out.println("No such file: " + args[0]);
      }
   }
}

