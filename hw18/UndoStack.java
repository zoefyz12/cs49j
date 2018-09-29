package hw18;

import java.util.Stack;

public class UndoStack {

	private Stack <String>stack;
	
	public UndoStack()
	{
		stack = new Stack<String>();
	}
	
	public void add(String phrase)
	{
		stack.add(phrase);
	}
	
	public String undo() 
	{
		if (stack.isEmpty())
			return null;
		else
			return stack.pop();
	}
	
	public void undoAll()
	{
		stack.clear();
	}
}
