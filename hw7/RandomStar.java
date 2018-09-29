package hw7;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.util.Random;

public class RandomStar {

	private Random gen;
	int x, y, maxDistance, numberOfLines;
	   
	public RandomStar(int x, int y, int maxDistance, int numberOfLines)
	{
		gen = new Random(987654321);
		this.x = x;
		this.y = y;
		this.maxDistance = maxDistance;
		this.numberOfLines = numberOfLines;
	}
	
	public void draw(Graphics2D g2)
	{
	Line2D.Double line;

		for (int i = 0; i < numberOfLines; i ++)
		{	
			line = new Line2D.Double(x, y, x + gen.nextInt(maxDistance * 2) - maxDistance, y + gen.nextInt(maxDistance * 2) - maxDistance);
			g2.draw(line);
		}
	}
}
