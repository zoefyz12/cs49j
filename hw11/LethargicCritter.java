package hw11;

public class LethargicCritter extends Critter{

	private boolean eat;
	
	public LethargicCritter(double theWeight) {
		super(theWeight);
		eat = true;
	}

	public void move (int steps)
	{
		if (eat)
		{
			super.addHistory("eat");
			eat = false;
		}
		else
		{
			super.addHistory("sleep");
			eat = true;
		}
	}
	
}
