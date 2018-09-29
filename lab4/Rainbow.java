package hw4;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Rainbow {
	
	private static int x, y, height, width;
	private static Color a, b;
	   	
	public Rainbow(int x, int y, int height)
	{
		this.x = x;
		this.y = y;
		this.height = height;
		width = height * 5;
		a = new Color(75, 0, 130);
		b = new Color(143, 0, 255);
	}
	
	public static void draw(Graphics2D g2)
	{
		g2.setColor(Color.RED);
		Rectangle box1 = new Rectangle(x, y, width, height);
		g2.fill(box1);
	      
	      
		g2.setColor(Color.ORANGE);
		Rectangle box2 = new Rectangle(x, y + height, width, height);
		g2.fill(box2);
	      
		g2.setColor(Color.YELLOW);
		Rectangle box3 = new Rectangle(x, y + 2 * height, width, height);
		g2.fill(box3);
	      
		g2.setColor(Color.GREEN);
		Rectangle box4 = new Rectangle(x, y + 3 * height, width, height);
		g2.fill(box4);
	      
		g2.setColor(Color.BLUE);
		Rectangle box5 = new Rectangle(x, y + 4 * height, width, height);
		g2.fill(box5);
	      
		g2.setColor(a);
		Rectangle box6 = new Rectangle(x, y + 5 * height, width, height);
		g2.fill(box6);
	      
		g2.setColor(b);
		Rectangle box7 = new Rectangle(x, y + 6 * height, width, height);
		g2.fill(box7);
	}

}
