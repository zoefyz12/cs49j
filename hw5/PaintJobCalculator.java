package hw5;

/**
 * Describes a PaintJob of a cylindrical room 
 * with a domed roof
 */
public class PaintJobCalculator
{
	
	public static final double PRICE = 95.5;
	public static final int SQ_FT_PER_SQ_YARD = 9;
	
	private double height, radius;
	
	/**
	 * The method get the height and the readius from the user
	 * @param height The height of the cylinder
	 * @param radius The radius of the dome
	 */
	
	public PaintJobCalculator(double height, double radius)
	{
		this.height = height;
		this.radius = radius;
	}
	
	/**
	 * sets a new height for room in this paint job
	 * @param theHeight the new height
	 */
	public void setHeight(double theHeight)
	{
		height = theHeight;
	}
	    
	/**
	 * sets a new radius for room in this paint job
	 * @param theRadius the new radius
	 */
	public void setRadius(double theRadius)
	{
		radius = theRadius;
	}
	
	/**
	 * This method get the net surface area 
	 * @return The net surface area will be returned as double
	 */
	
	public double getSurfaceArea()
	{
		double cylinder = 2 * Math.PI * radius * height;
		double dome = 2 * Math.PI * radius * radius;
		
		return cylinder + dome;
	}
	    
	/**
	 * This method will get the net paint cost
	 * @return The net paint cost will be returned
	 */
	
	public double getPaintCost()
	{
		return (getSurfaceArea() / 40) * PRICE;
	}
	    
	/**
	 * This method will get the labor charge 
	 * @return The labor charge will be returned
	 */
	
	public double getLaborCharge()
	{
		return (getSurfaceArea() / SQ_FT_PER_SQ_YARD) * 100;
	}
	    
	/**
	 * This method will get the total price including the labor charge and the paint cost
	 * @return The total charge will be returned
	 */
	
	public double getCustomerPrice()
	{
		return getLaborCharge() + getPaintCost();
	}
}

