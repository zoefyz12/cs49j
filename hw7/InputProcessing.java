package hw7;

import java.util.Scanner;

public class InputProcessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a double or Q to quit: ");
		if (!(scan.hasNextInt() && scan.hasNextDouble()))
		{
			System.out.print("no input");
		}
		String output = "";
		double input = scan.nextDouble();
		double positive = 0;
		double sum = 0;
		int count = 0;
		while (scan.hasNextDouble())
		{
			double value = scan.nextDouble();
			if (value % 1.0 == 0.0)
			{
				output = output + Double.toString(value) + ", ";
				
				
			}
			if(value < input)
			{
				input = value;
			}
			else if(value > positive)
			{
				sum = sum + value;
				count ++;
			}
			
			System.out.print("Enter a double or Q to quit: ");
			
	
		}
		System.out.println(output.substring(0, output.length() - 2));
		System.out.println(input);
		if (sum == 0)
		{
			System.out.println(sum);
		}
		else
		System.out.println(sum/count);

	}

}
