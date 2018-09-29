package hw5;

public class AmazonOrder {
	
	public static final double tax = 8.5;
	private String contents;
	private double subtotal;
	
	public AmazonOrder()
	{
		subtotal = 0;
		contents  = "";
	}
	
	public void add(double cost)
	{
		subtotal += cost;
		contents += "Add Item: " + String.valueOf(cost) + '\n';
	}

	public void remove(double cost)
	{
		subtotal -= cost;
		contents += "Remove Item: " + String.valueOf(cost) + '\n';
	}
	
	public double getSubtotal()
	{
		return subtotal;
	}
	
	public double getTotal()
	{
		return subtotal * tax * 0.01 + subtotal;
	}
	
	public String getContents()
	{
		if (!contents.contains("Total"))
			contents += "Total: " + String.valueOf(getTotal()) + '\n';
		
		return contents;
	}
	
	public void reset()
	{
		subtotal = 0;
		contents = "";
	}
}
