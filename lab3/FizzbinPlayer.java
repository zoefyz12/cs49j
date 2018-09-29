package HW3;

/**
 * Models a player of the game Fizzbin
 * @author Fangyi Zhao
 *
 */

public class FizzbinPlayer {

	private String name;
	private int adjustmentValue;
	
	/**
	 * comment
	 * @param name
	 * @param adjustmentValue
	 */
	
	public FizzbinPlayer(String name, int  adjustmentValue) 
	{
		this.name = name;
		this.adjustmentValue = adjustmentValue;
	}

	/**
	 * comment
	 * @return
	 */
	
	public String getName()
	{
		return name;
	}
	
	/**
	 * comment
	 * @return
	 */
	
	public int getAdjustment()
	{
		return adjustmentValue;
	}
	
	/**
	 * comment
	 * @param value
	 */
	
	public void setAdjustment(int value)
	{
		adjustmentValue = value;
	}
}
