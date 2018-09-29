package hw18;

import java.util.Queue;

public class ToDoItem implements Comparable {

	String description;
	int priority;
	
	public ToDoItem(String description, int priority)
	{
		this.description = description;
		this.priority = priority;
	}

	@Override
	public int compareTo(Object o) {
		ToDoItem other = (ToDoItem)o;
		
		if (other.priority < this.priority)
			return 1;
		else if (other.priority > this.priority)
			return -1;
		else
			return 0;
	}
	
	public String toString ()
	{
		return "ToDoItem[description=" + description + ",priority=" + priority + "]";
	}
}
