package hw17;

import java.util.Map;
import java.util.TreeMap;

public class StudentManager {

	private Map<String, String> student; 
	
	public StudentManager()
	{
		student = new TreeMap<String, String>();
	}
	
	public void add(String name, String grade) 
	{
		student.put(name, grade);
	}
	
	public void remove(String name) 
	{
		student.remove(name);
	}
	
	public int getClassSize() 
	{
		return student.size();
	}
	
	public String getPrintableRoster()
	{
		String roster = "";
		
		for (Map.Entry<String, String> entry : student.entrySet()) 
		{
			roster += entry.getKey() + ": " + entry.getValue() + "\n";
		}

		return roster;
	}
		 
}
