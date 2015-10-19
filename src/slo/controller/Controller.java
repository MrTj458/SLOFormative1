package slo.controller;

import java.util.Scanner;
import slo.view.Console;

/**
 * Controller for the SLO Formative 1 assessment.
 * @author thod0127
 * @version 1.0 10/19/15
 */
public class Controller
{
	private Scanner input;
	private Console output;
	
	/**
	 * Sets up the needed objects on class creation.
	 */
	public Controller()
	{
		input = new Scanner(System.in);
		output = new Console();
	}
	
	/**
	 * Starts the needed methods for the program to run.
	 */
	public void start()
	{
		output.show("Running!");
		output.skipLine();
		askQuestions();
	}
	
	/**
	 * Asks the questions for the user to answer.
	 */
	private void askQuestions()
	{
		output.show("Hello, What is your name?");
		String name = input.nextLine();
		output.show("Nice to meet you " + name + ".");
		output.skipLine();
		output.show("How old are you? (You can enter Decimals.)");
		double age = input.nextDouble();
		if(age > 125)
		{
			output.show(age + "? That's not possible.");
		}
		else
		{
			output.show("Really " + age + "? Thats neat!");
		}
		output.skipLine();
		output.show("I can count really fast do you want to see? [y/n]");
		String seeChoice = input.next();
		while(!answerCheck(seeChoice))
		{
			output.show("Please enter either 'y' or 'n'");
			seeChoice = input.next();
		}
		if(seeChoice.equals("y"))
		{
			count();
		}
		else if(seeChoice.equals("n"))
		{
			output.show("Oh well. Have a good day then.");
			System.exit(0);
		}
	}
	
	/**
	 * Method for controlling the counting if the user wants the computer to count.
	 */
	private void count()
	{
		output.show("Allright!");
		output.show("What number do you want me too count to? (Numbers bigger than 1 million take a long time to calculate.)");
		int countNumber = input.nextInt();
		if(countNumber >= 1000000)
		output.skipLine();
		for(int counter = 1; counter <= countNumber; counter++)
		{
			output.show(Integer.toString(counter));
		}
		
		output.skipLine();
		if(countNumber >= 1000)
		{
			output.show("Tada!");
		}
		else if(countNumber <= 100)
		{
			output.show("That's not a big number.");
		}
		else if(countNumber <= 500)
		{
			output.show("Go bigger next time.");
		}
		else if(countNumber < 1000)
		{
			output.show("I can do better than that!");
		}
		output.skipLine();
	}
	
	/**
	 * Checks if the inputed string is 'y' or 'n'.
	 * @param input
	 * @return true or false
	 */
	private boolean answerCheck(String input)
	{
		boolean validAnswer = false;
		
		if(input.equals("y") || input.equals("n"))
		{
			validAnswer = true;
		}
		
		return validAnswer;
	}
	
}
