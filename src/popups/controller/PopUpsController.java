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



}
