package hw18;

import java.util.PriorityQueue;

public class ToDoList {
	
	PriorityQueue<ToDoItem> list;
	
	public ToDoList()
	{
		list = new PriorityQueue<ToDoItem>();
	}
	
	public void add(ToDoItem item) 
	{
		list.add(item);
	}
	
	public ToDoItem nextItem() 
	{
		return list.poll();
	}
	
	public boolean hasNext() 
	{
		return !list.isEmpty();
	}
	
	public ToDoItem peek()
	{
		return list.peek();
	}
}
