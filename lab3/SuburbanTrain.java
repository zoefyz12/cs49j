package HW3;

/**
 * 
 * comment 
 * @author Fangyi Zhao
 *
 */

public class SuburbanTrain {

	private int track;
	
	/**
	 * comment
	 */
	
	public SuburbanTrain()
	{
		track = 0;
	}
	
	/**
	 * comment
	 * @return
	 */
	
	public int distanceToStart() {
		return Math.abs(track);
	}

	/**
	 * comment
	 * @return
	 */
	
	public int distanceToEnd() {
		return 50 - Math.abs(track);
	}

	/**
	 * comment
	 * @param numberOfStops
	 */
	
	public void move(int numberOfStops) 
	{
		track += numberOfStops * 5;
	}

	/**
	 * comment
	 */
	
	public void turn() 
	{
		track *= -1;
	}

}
