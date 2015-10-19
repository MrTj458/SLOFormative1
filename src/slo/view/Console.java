package slo.view;

/**
 * Are you too lazy to type 'System.out.println()'? Then this is the place for you!
 * This does most of the typing for you! All lazy people welcome!
 * @author thod0127
 * @version 1.0 10/19/15
 */
public class Console
{
	/**
	 * Displays the inputed String to the console.
	 * @param input
	 */
	public void show(String input)
	{
		System.out.println(input);
	}
	
	/**
	 * Outputs a blank String to the console to have the effect of pressing 'enter' to a new line.
	 */
	public void skipLine()
	{
		System.out.println("");
	}
}
