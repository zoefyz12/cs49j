package hw8;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class TemperatureMap {

	private int[][] mapData;
	
	public TemperatureMap(int[][] data)
	{
		mapData = data;
	}
	
	public void drawMap(Graphics2D g2)
	{
		Rectangle box;
		
		for (int i = 0; i < mapData.length; i++)
		{
			for (int j = 0; j < mapData[0].length; j++)
			{
				g2.setColor(getColor(mapData[i][j]));
    			box = new Rectangle(j  * 10, i * 10, 10, 10);
    			g2.fill(box);
			}
		}
	}
	
	private Color getColor(int tem)
	{
		if (tem <= 32)
			return Color.BLUE;
		else if (tem > 32 && tem <= 50)
			return Color.GREEN;
		else if (tem > 50 && tem <= 85)
			return Color.ORANGE;
		else if (tem > 85)
			return Color.RED;
		return null;
	}
	
	public int maxDifference()
	{
		int max = mapData[0][0];
		int min = mapData[0][0];

		for (int i = 0; i < mapData.length; i++) 
		{
		    for (int j = 0; j < mapData[i].length; j++) 
		    {
		        if (mapData[i][j] > max) 
		        {
		           max = mapData[i][j];
		        }
		        
		        if (mapData[i][j] < min) 
		        {
		           min = mapData[i][j];
		        }
		    }
		}
		
		return max - min;
	}
}
