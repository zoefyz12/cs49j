package hw6;
/**
 * The Suite class determine the cost of a suite for the beach resort.
 * @author Fangyi Zhao
 *
 */

public class Suite {

	private String view, season;
	private int occupants;
	private double cost;
	/**
	 * Construct of Suite with the given view, given season and its occupants.
	 * @param view The view you want to choose.
	 * @param season The season you choose.
	 * @param occupants The number of the occupants.
	 */
	
	public Suite(String view, String season, int occupants)
	{
		this.view = view;
		this.season = season;
		this.occupants = occupants;
	}
	/**
	 * This method is called the getcost, which helps get the cost of the suite.
	 * @return cost The cost of the select suite.
	 */
	public double getCost()
	{
		/**
		 * Determined if the enter of view is "Street", if it is, go to the next if statement.
		 */
		if (view.equalsIgnoreCase("Street"))
		{
			/**
			 * Determined if the enter of season is "Winter", if it is, then go to the next if statement;
			 * if it is not, then account it as "Summer".
			 */
			if (season.equalsIgnoreCase("Winter"))
			{
				/**
				 * Determined if the occupant is less or equal to 2, if it is, then the cost is 150.
				 * If it is not, then go the the else if statement.
				 */
				if (occupants <= 2)
					cost = 150;
				/**
				 * Determined if the occupant is large than 2 and less or equal than 4, then charge 210.
				 */
				else if (occupants > 2 && occupants <= 4)
					cost = 210;
				/**
				 * For other number of the occupant, charge 200 for each person.
				 */
				else
					cost = occupants * 200; 
			}
			/**
			 * The other probabilities of the enter of the view is not equal to "Winter", 
			 * then account all of them as "Season".
			 */
			else
			{
				/**
				 * Determined if the occupant is less or equal to 2, if it is, then the cost is 200.
				 * If it is not, then go the the else if statement. 
				 */
				if (occupants <= 2)
					cost = 200;
				/**
				 * Determined if the occupant is large than 2 and less or equal than 4, then charge 325.
				 */
				else if (occupants > 2 && occupants <= 4)
					cost = 325;
				/**
				 * For other number of the occupant, charge 200 for each person.
				 */
				else
					cost = occupants * 200; 
			}
		}
		/**
		 * The other probabilities of the enter of the view is not equal to "Street", 
		 * then account all of them as "Ocean".
		 */
		else
		{
			/**
			 * Determined if the enter of season is "Winter", if it is, then go to the next if statement.
			 */
			if (season.equalsIgnoreCase("Winter"))
			{
				/**
				 * Determined if the occupant is less or equal to 2, if it is, then the cost is 175.
				 * If it is not, then go the the else if statement.
				 */
				if (occupants <= 2)
					cost = 175;
				/**
				 * Determined if the occupant is large than 2 and less or equal than 4, then charge 315.
				 */
				else if (occupants > 2 && occupants <= 4)
					cost = 315;
				/**
				 * For other number of the occupant, charge 200 for each person.
				 */
				else
					cost = occupants * 200; 
			}
			/**
			 * The other probabilities of the enter of the season is not equal to "Winter", 
			 * then account all of them as "Summer".
			 */
			else
			{
				/**
				 * Determined if the occupant is less or equal to 2, if it is, then the cost is 250.
				 * If it is not, then go the the else if statement. 
				 */
				if (occupants <= 2)
					cost = 250;
				/**
				 * Determined if the occupant is large than 2 and less or equal than 4, then charge 375.
				 */
				else if (occupants > 2 && occupants <= 4)
					cost = 375;
				/**
			     * For other number of the occupant, charge 200 for each person.
				 */
				else
					cost = occupants * 200; 
			}
		}
		
		return cost;
	}
}
