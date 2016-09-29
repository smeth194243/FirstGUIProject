package popups.controller;

import popups.view.PopupViewer;

public class PopUpsController
{
	private PopupViewer display;
	
	public PopUpsController()
	{
		display = new PopupViewer();
	}
	
	public void start()
	{
		int count = 0;
		String answer = "sample";
		while(answer != null && !answer.equals(""))
		{
		display.displayMessage("Look! Words! On the monitor!!!!");
		
		answer = display.collectResponse("Type your question here :D");
		
		count++;
		}
	}
/**
 * Checks a supplied String value to see if it can be converted to a double.
 * @param potentialValue The supplied String.
 * @return Whether the conversion to a double is possible as a boolean value.
 */
	private boolean isDouble(String potentialValue)
{
	boolean validDouble = false;
	
	try
	{
		double testValue = Double.parseDouble(potentialValue);
		validDouble = true;

	}
	catch(NumberFormatException notDoubleError)
	{
		display.displayMessage("That was not a double =:<");
	}
	
	return validDouble;
}
/**
 * Checks the supplied String value to see if it can bee converted to an integer.
 * If it cannot a popup message is displayed.	
 * @param potentialValue The supplied String.
 * @return Whether a conversion to an integer is possible.
 */
private boolean isInteger(String potentialValue)
{
	boolean validInteger = false;
	
	try
	{
		int testValue = Integer.parseInt(potentialValue);
		validInteger = true;
	}
	catch(NumberFormatException notIntegerError)
	{
		display.displayMessage(notIntegerError.getMessage());
		display.displayMessage("You need to type in an integer.");
	}
	
	return validInteger;
}




}
