package hw15;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class RectangleComparatorByArea implements Comparator<Rectangle>{

	@Override
	public int compare(Rectangle r1, Rectangle r2) {
		double area1 = r1.getWidth() * r1.getHeight();
		double area2 = r2.getWidth() * r2.getHeight();
		
		if (area1 > area2)
			return 1;
		else if (area1 < area2)
			return -1;
		else
			return 0;
	}
}

class RectangleComparatorByPerimeter implements Comparator<Rectangle>{

	@Override
	public int compare(Rectangle r1, Rectangle r2) {
		double perimeter1 = (r1.getWidth() + r1.getHeight()) * 2;
		double perimeter2 = (r2.getWidth() + r2.getHeight()) * 2;
		
		if (perimeter1 > perimeter2)
			return -1;
		else if (perimeter1 < perimeter2)
			return 1;
		else
			return 0;
	}
}

public class RectangleSorter {

	static void sortByArea(ArrayList<Rectangle> list) 
	{
		Collections.sort(list, new RectangleComparatorByArea());
	}
	
	static void sortByDescendingPerimeter (ArrayList<Rectangle> list)
	{
		Collections.sort(list, new RectangleComparatorByPerimeter());
	}
	
}
