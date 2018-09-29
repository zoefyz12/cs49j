package hw6;


public class SemiCircle {
	
	public int x, y, radius;
	
	public SemiCircle(int centerX, int centerY, int theRadius)
	{
		x = centerX;
		y = centerY;
		radius = theRadius;
	}
	
	public boolean contains(int otherX, int otherY)
	{
		double distance = Math.sqrt(Math.pow(x - otherX, 2) + Math.pow(y- otherY, 2));
		
		if (distance < radius && distance > 0 && otherY < y)
			return true;
		else 
			return false;
	}
	
	public boolean intersects( SemiCircle other) 
	{
		int tWY = y;
		int tWX = x - radius;
		int tEY = y;
		int tEX = x + radius;
		int tNY = y - radius;
		int tNX = x;
		
		int oWY = other.y;
		int oWX = other.x - other.radius;
		int oEY = other.y;
		int oEX = other.x + other.radius;
		int oNY = other.y - other.radius;
		int oNX = other.x;
		
		if ((other.contains(tWX, tWY) || other.contains(tEX, tEY) || other.contains(tNX, tNY)) && 
				!(other.contains(tWX, tWY) && other.contains(tEX, tEY) && other.contains(tNX, tNY)) ||
				(this.contains(oWX, oWY) || this.contains(oEX, oEY) || this.contains(oNX, oNY)) && 
				!(this.contains(oWX, oWY) && this.contains(oEX, oEY) && this.contains(oNX, oNY)))
			return true;
		
		return false;
	}
}
