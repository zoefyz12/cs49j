package hw10;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

public class TrafficLight {

	private int x;
	private int y;
	public static final int RED = 0;
	public static final int YELLOW = 1;
	public static final int GREEN = 2;
	public static int state = 0;
	public TrafficLight(int x, int y)
	{
		this.x = x;
		this.y = y;
		state = RED;
	}
	public void cycle()
	{
		if (state == RED)
		{
			state = GREEN;
		}
		else if (state == GREEN)
		{
			state = YELLOW;
		}
		else if (state == YELLOW)
		{
			state = RED;
		}
	}
	public String getLight()
	{
		String currentState = "";
		if (state == RED)
		{
			currentState = "red";
		}
		else if (state == GREEN)
		{
			currentState = "green";
		}
		else if (state == YELLOW)
		{
			currentState = "yellow";
		}
		return currentState;
	}
	public void draw(Graphics2D g2)
	{
		g2.setColor(Color.BLACK);
		Rectangle box = new Rectangle(x, y, 20, 60);
		g2.draw(box);
		if (state == RED)
		{
			g2.setColor(Color.RED);
			Ellipse2D.Double cir1 = new Ellipse2D.Double(x, y, 20, 20);
			g2.fill(cir1);
			g2.setColor(new Color(255,165,00));
			Ellipse2D.Double cir2 = new Ellipse2D.Double(x, y+20, 20, 20);
			g2.fill(cir2);
			g2.setColor(new Color(85,107,47));
			Ellipse2D.Double cir3 = new Ellipse2D.Double(x, y+40, 20, 20);
			g2.fill(cir3);
		}
		else if (state == GREEN)
		{
			g2.setColor(new Color(128,00,00));
			Ellipse2D.Double cir1 = new Ellipse2D.Double(x, y, 20, 20);
			g2.fill(cir1);
			g2.setColor(new Color(255,165,00));
			Ellipse2D.Double cir2 = new Ellipse2D.Double(x, y+20, 20, 20);
			g2.fill(cir2);
			g2.setColor(Color.GREEN);
			Ellipse2D.Double cir3 = new Ellipse2D.Double(x, y+40, 20, 20);
			g2.fill(cir3);
		}
		else if (state == YELLOW)
		{
			g2.setColor(new Color(128,00,00));
			Ellipse2D.Double cir1 = new Ellipse2D.Double(x, y, 20, 20);
			g2.fill(cir1);
			g2.setColor(Color.YELLOW);
			Ellipse2D.Double cir2 = new Ellipse2D.Double(x, y+20, 20, 20);
			g2.fill(cir2);
			g2.setColor(new Color(85,107,47));
			Ellipse2D.Double cir3 = new Ellipse2D.Double(x, y+40, 20, 20);
			g2.fill(cir3);
		}
	}
}
