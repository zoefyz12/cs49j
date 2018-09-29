package hw6;

/**
 *  Verb class is going to represent a verb and its past version in English. 
 * @author Fangyi Zhao
 *
 */
public class Verb {
	
	private String verb;
	
	/**
	 * Construct of Verb with the given verb.
	 * @param verb The verb.
	 */
	public Verb(String verb)
	{
		this.verb = verb;
	}

	/**
	 * This method is going to show the verb.
	 * @return verb  The original version of the verb.
	 */
	public String getVerb()
	{
		return verb;
	}
	/**
	 * This method is going to show the past version of the verb.
	 * @return past The past version of the verb.
	 */
	public String getPast()
	{
		String past = verb;
		/**
		 * Determined that if the verb is irregular verb "run", if it is, then output "ran".
		 */
		if (verb.equals("run"))
			past = "ran";
		/**
		 * Determined that if the verb is irregular verb "ride", if it is, then output "rode".
		 */
		else if (verb.equals("ride"))
			past = "rode";
		/**
		 * Determined that if the verb is irregular verb "see", if it is, then output "saw".
		 */
		else if (verb.equals("see"))
			past = "saw";
		/**
		 * Determined that if the verb ends in a "y", if it is, then change the "y" to "i" and add "ed".
		 */
		else if (verb.endsWith("y"))
			past = verb.substring(0, verb.length() - 1) + "ied";
		/**
		 * Determined that if the verb ends in an "e", if it is, then just add "d".
		 */
		else if (verb.endsWith("e"))
			past += "d";
		/**
		 * Determined that if the verb is three characters
		 * long and ends in a consonant, if it is, then double the consonant and add "ed".
		 */
		else if (verb.length() == 3 && !(verb.endsWith("a") || verb.endsWith("e") || verb.endsWith("i") || verb.endsWith("o") || verb.endsWith("u")))
		{
			past = verb + verb.charAt(verb.length() - 1) + "ed";
		}
		/**
		 * For the else is the regular verb which just add "ed" in the end.
		 */
		else
			past += "ed";
		
		return past;
	}
}
