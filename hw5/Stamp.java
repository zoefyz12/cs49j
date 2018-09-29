package hw5;

/**
 * Stamp class get the name from user and return with special format
 * @author Fangyi Zhao
 *
 */

public class Stamp {

	private String first, middle, last;
	
	/**
	 * This method gets the first name, middle initial, and the last name from user
	 * @param theFirst the first name
	 * @param theMiddleInitial the middle initial
	 * @param theLast the last name
	 */
	
	public Stamp(String theFirst, String theMiddleInitial, String theLast)
	{
		first = theFirst;
		middle = theMiddleInitial;
		last = theLast;
	}
	
	/**
	 * This method gets the first name and the last name from user, the middle name will be an empty
	 * string
	 * @param theFirst the first name
	 * @param theLast the last name
	 */
	
	public Stamp(String theFirst, String theLast)
	{
		first = theFirst;
		last = theLast;
		middle = "";
	}
	
	/**
	 * This method returns the first name
	 * @return The first name will be returned
	 */
	
	public String getFirst()
	{
		return first;
	}
	
	/**
	 * This method returns the middle name
	 * @return The middle name will be returned
	 */
	
	public String getMiddleInitial()
	{
		return middle;
	}
	
	/**
	 * This method returns the last name
	 * @return The last name will be returned
	 */
	
	public String getLast()
	{
		return last;
	}
	
	/**
	 * This method return the number of characters of name
	 * @return The name of characters of name will be returned
	 */
	
	public int characterCount() 
	{
		return first.length() + middle.length() + last.length();
	}
	
	/**
	 * This method returns the initial of the name, which is the first character of each part of name
	 * @return The initial of name will be returned
	 */
	
	public String getInitials()
	{
		return first.charAt(0) + middle + last.charAt(0);
	}
}
