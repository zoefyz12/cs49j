package hw9;

import java.util.ArrayList;

public class Staff {
	
	private ArrayList<String> staffName;
	
	public Staff(ArrayList<String> name)
	{
		staffName = name;
	}
	public boolean equals(Staff other)
	{
		ArrayList<String> otherList = other.getName();
		if (staffName.size() != otherList.size())
		{
			return false;
		}
		else
		{
			for (int i = 0; i < staffName.size(); i++)
			{
				if (staffName.get(i) != otherList.get(i))
				{
					return false;
				}
			}
		}
		return true;
	}
	
	public boolean sameContents(Staff other)
	{
		ArrayList<String> otherList2 = other.getName();
		if (staffName.size() != otherList2.size())
		{
			return false;
		}
		else
		{
			for (int i = 0; i < staffName.size(); i++)
			{
				if (!otherList2.contains(staffName.get(i)))
				{
					return false;
				}
			}
		}
			return true;
	}
	public void replaceVowelsWith(String text)
	{
		 String vowels = "AEIOUYaeiouy";
		 String tem;
		 
		 for (int i = 0; i < staffName.size(); i++)
		 {
			 for (int j = 0; j < staffName.get(i).length(); j++)
			 {				 
				 if (vowels.contains(staffName.get(i).substring(j, j+1)))
				 {
					 tem = staffName.get(i);
					 
					 if (j == staffName.get(i).length() - 1)
					 {
						 staffName.set(i, tem.substring(0,j)+ text);
					 }
					 else
						 staffName.set(i, tem.substring(0,j)+ text + tem.substring(j + 1, tem.length()));
						 
				 }
			 }
		 }
	}
	
	public String mostVowels()
	{
		if(staffName.size() == 0)
		{
			return null;
		}
		 String vowels = "AEIOUaeiou";
		 int maxCounter = 0;
		 String maxVowel = "";
		 for (int j = 0; j < staffName.get(0).length(); j++)
		 {
			 if (vowels.contains(staffName.get(0).substring(j, j+1)))
			 {
				 maxCounter++;
			 }
		 }
		 maxVowel = staffName.get(0);
		 for (int i = 1; i < staffName.size(); i++)
		 {
			 int counter = 0;
			 for (int h = 0; h < staffName.get(i).length(); h++)
			 {
				
				 if (vowels.contains(staffName.get(i).substring(h, h+1)))
				 {
					 counter++;
				 }
			 }
			 if (counter > maxCounter)
			 {
				 maxCounter = counter;
				 maxVowel =  staffName.get(i);
			 }
		 }	
		 
		 return maxVowel;	 
	}	
		
	public String toString()
	{
		String s = "";
		s = s + staffName.toString();
		return s;
	}
	public ArrayList<String> getName()
	{
		return staffName;
	}
}
