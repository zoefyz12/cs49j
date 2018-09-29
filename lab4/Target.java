package hw4;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Target {

	private static int x, y, r;
	
	public Target (int x, int y, int r)
	{
		this.x = x;
		this.y = y;
		this.r = r;
	}
	
	public void draw(Graphics2D g2)
	{
		Ellipse2D.Double cir1 = new Ellipse2D.Double(x - 3 * r, y - 3 * r, 6 * r, 6 * r);
		g2.setColor(Color.RED);
		g2.fill(cir1);
	      
		Ellipse2D.Double cir2 = new Ellipse2D.Double(x - 2 * r, y - 2 * r, 4 * r, 4 * r);
		g2.setColor(Color.WHITE);
		g2.fill(cir2);
	      
		Ellipse2D.Double cir3 = new Ellipse2D.Double(x - r, y - r, 2 * r, 2 * r);
		g2.setColor(Color.RED);
		g2.fill(cir3);
	}
}
