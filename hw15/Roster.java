package hw15;

import java.util.Collections;
import java.util.LinkedList;

public class Roster {

	LinkedList<Student> list;
	
	public Roster()
	{
		list = new LinkedList<>();
	}
	
	void add(Student s) 
	{
		list.add(s);
	}
	
	void remove(String name) 
	{
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i).getName().equalsIgnoreCase(name))
			{
				list.remove(i);
				return;
			}
		}
	}
	
	LinkedList<String> getNames()
	{
		LinkedList<String> nameList = new LinkedList<>();
		
		for (int i = 0; i < list.size(); i++)
			nameList.add(list.get(i).getName());
		
		Collections.sort(nameList);
		
		return nameList;
	}
}
