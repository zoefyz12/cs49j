package hw11;

public class MulishCritter extends Critter{

	private int counter;
	
	public MulishCritter(double theWeight) {
		super(theWeight);
		counter = 0;
	}

	public void move(int steps)
	{
		if (counter % 3 == 0)
			super.move(steps);
		
		counter++;
	}
	
}
