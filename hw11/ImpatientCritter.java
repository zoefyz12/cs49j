package hw11;

public class ImpatientCritter extends Critter{

	public ImpatientCritter(double theWeight) 
	{
		super(theWeight);
	}

	public void move(int steps)
	{
		super.move(steps * 2);
	}
}
