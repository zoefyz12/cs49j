package HW3;

/**
 * comment
 * @author Administrator
 *
 */

public class VotingMachine 
{
	private int yes, no;
	
	/**
	 * comment
	 */
	
	public VotingMachine()
	{
		yes  = 0;
		no = 0;
	}
	
	/**
	 * comment
	 */
	
	public void voteYes()
	{
		yes++;
	}
	
	/**
	 * comment
	 */
	
	public void voteNo()
	{
		no++;
	}
	
	/**
	 * comment
	 * @return
	 */
	
	public int getYesVotes()
	{
		return yes;
	}
	
	/**
	 * comment
	 * @return
	 */
	
	public int getNoVotes()
	{
		return no;
	}
}
