package popups.controller;

import popups.view.PopupViewer;
import popups.model.Thingy;
import java.util.List;
import java.util.ArrayList;

public class PopUpsController
{
	private PopupViewer display;
	private List<Thingy> thingyList;

	public PopUpsController()
	{
		display = new PopupViewer();
		thingyList = new ArrayList<Thingy>();
	
	}
	
	public void start()
	{
		learnLists();
	}
	
	private void askQuestionLoop()
	{
String answer = "sample";
		
		while(answer != null && !isDouble(answer))
		{
		//display.displayMessage("Look! Words! On the monitor!!!!");
		answer = display.collectResponse("You need to type in a double!");
		
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


	private void learnLists()
	{
		display.displayMessage("This is the size of the list: " + thingyList.size());
		Thingy firstThingy = new Thingy();
		thingyList.add(firstThingy);
		
		display.displayMessage("This is the size of the list: " + thingyList.size());
		Thingy secondThingy = new Thingy();
		thingyList.add(secondThingy);
		
		display.displayMessage("This is the size of the list: " + thingyList.size());
		Thingy thirdThingy = new Thingy();
		thingyList.add(thirdThingy);
		
		display.displayMessage("This is the size of the list: " + thingyList.size());
		Thingy lastThingy = new Thingy();
		thingyList.add(lastThingy);
		
	}

}
