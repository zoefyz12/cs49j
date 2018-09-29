package hw16;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class TextCondensor {

	 private ArrayList<String> file;
	 private Set<String> set = new TreeSet<String>();
	
	public TextCondensor(ArrayList<String> file)
	{
		this.file = file;
	}
	
	public Set<String> condenseText() 
	{
		set.clear();
		
		for (int i = 0; i < file.size(); i++)
			set.add(file.get(i));
		
		return set;
	}
	
	public int condensedSize() 
	{
		return set.size();
	}
	
	public void setList(ArrayList<String> newText)
	{
		file = newText;
	}
	
}
