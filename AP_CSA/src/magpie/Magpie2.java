package magpie;
/*
* A program to carry on conversations with a human user.
* This is the initial version that:  
* <ul><li>
*       Uses indexOf to find strings
* </li><li>
* 		    Handles responding to simple words and phrases 
* </li></ul>
* This version uses a nested if to handle default responses.
* @author Laurie White
* @version April 2012
*/
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (statement.toLowerCase().indexOf("dog")>=0 || statement.toLowerCase().indexOf("cat")>= 0){
			response = "Tell me more about your pets";
		}
		else if (statement.toLowerCase().indexOf("remington") >= 0){
			response = "Mr. Remington is a great teacher!";
		}
		else if (statement.trim().length()==0){
			response="Say something please.";
		}
		else if (statement.toLowerCase().indexOf("name") >= 0){
			response="My name is Magpie. What's yours?";
		}
		else if (statement.toLowerCase().indexOf("food") >= 0){
			response="You are making me hungry.";
		}
		else if (statement.toLowerCase().indexOf("water") >= 0){
			response="Hydration is key!";
		}
		else 
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichResponse == 4)
		{
			response = "I don't understand...";
		}
		else if (whichResponse == 5)
		{
			response = "That is facetious";
		}
		return response;
	}
}