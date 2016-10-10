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
		//learnLists();
		//askQuestionLoop();
		
		String name = display.collectResponse("Hello. What is your name?");
		if(name.equalsIgnoreCase("Seth"))
		{
			display.displayMessage("You're a boss.");
			String question = display.collectResponse("How old are you?");
			if(question.equalsIgnoreCase("3"))
			{
				display.displayMessage("Wow, Thats young!");
			}
		}
		
		if(name.equalsIgnoreCase("Jacob"))
		{
			display.displayMessage("The answer is command Q.");
		}
		if(name.equalsIgnoreCase("Isaac"))
		{
			display.displayMessage("You are a bro.");
		}
		if(name.equalsIgnoreCase("Arick"))
		{
			display.displayMessage("You are the reason I have an A in this class.");
		}
		if(name.equalsIgnoreCase("Tyler"))
		{
			display.displayMessage("Get the heck off my computer!");
		}
		else
		{
			display.displayMessage("Well, it appears we havent met yet!");
			String live = display.collectResponse("Where do you live bro?");
			
			if(live.equalsIgnoreCase("Utah"))
			{
				display.displayMessage("Oh cool, I live there too!");
			}
			else
			{
				display.displayMessage("Oh cool! I live here in Utah!");
			}
		}
		
		int age = this.stringToInt(display.collectResponse("How old are you?"));
		if(age <= 10)
		{
			display.displayMessage("You are pretty young!");
		}
		else if(age == 16)
		{
			display.displayMessage("Cool! Im 16 as well!");
		}
		else
		{
			display.displayMessage("Oh cool! Im 16.");
		}
	}

	private void askQuestionLoop()
	{
		String answer = "sample";

		while (answer != null && !isDouble(answer))
		{
			// display.displayMessage("Look! Words! On the monitor!!!!");
			answer = display.collectResponse("You need to type in a double!");

		}
	}

	/**
	 * Checks a supplied String value to see if it can be converted to a double.
	 * 
	 * @param potentialValue
	 *            The supplied String.
	 * @return Whether the conversion to a double is possible as a boolean
	 *         value.
	 */
	private boolean isDouble(String potentialValue)
	{
		boolean validDouble = false;

		try
		{
			double testValue = Double.parseDouble(potentialValue);
			validDouble = true;

		}
		catch (NumberFormatException notDoubleError)
		{
			display.displayMessage("That was not a double =:<");
		}

		return validDouble;
	}

	/**
	 * Checks the supplied String value to see if it can bee converted to an
	 * integer. If it cannot a popup message is displayed.
	 * 
	 * @param potentialValue
	 *            The supplied String.
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
		catch (NumberFormatException notIntegerError)
		{
			display.displayMessage(notIntegerError.getMessage());
			display.displayMessage("You need to type in an integer.");
		}

		return validInteger;
	}
	
	public int stringToInt(String string){
		int num = 0;
		try{
			num = Integer.parseInt(string);
		}catch(NumberFormatException e){
			e.printStackTrace();
		}
		return num;
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

		for (int index = 0; index < 5; index++)
		{
			Thingy loopThingy = new Thingy();
			thingyList.add(loopThingy);
		}

		for (int index = 0; index < thingyList.size(); index++)
		{
			display.displayMessage("The thingy at this spot has words of: " + thingyList.get(index).getWordthing());
		}

		Thingy specialThingy = new Thingy();
		specialThingy.setWordthing("not null stuff");

		thingyList.add(1, specialThingy);

		for (int index = 0; index < thingyList.size(); index++)
		{
			display.displayMessage("The message at " + index + " is " + thingyList.get(index).getWordthing());
		}

		thingyList.get(3).setWordthing("I just changed what is inside");
		Thingy tempThing = thingyList.get(4);

		for (int index = 0; index < thingyList.size(); index++)
		{
			display.displayMessage(thingyList.get(index).getWordthing());
		}

		Thingy replacement = new Thingy();
		replacement.setWordthing("I am a replicant");

		Thingy old = thingyList.set(0, replacement);

		thingyList.set(0, replacement);

		for (int index = 0; index < thingyList.size(); index++)
		{
			display.displayMessage(thingyList.get(index).getWordthing());
		}
		old.setWordthing("I was replaced :(");
		display.displayMessage(old.getWordthing());

		thingyList.remove(4);
		display.displayMessage("The size is now " + thingyList.size());
		old = thingyList.remove(4);
		display.displayMessage("The size is now " + thingyList.size());
		display.displayMessage("This is what I removed: " + old.getWordthing());
		thingyList.add(0, old);

		for (Thingy currentThingy : thingyList)
		{
			display.displayMessage("The current value is " + currentThingy.getWordthing());
		}

		for (Thingy currentThingy : thingyList)
		{
			currentThingy = new Thingy();
		}

		for (Thingy currentThingy : thingyList)
		{
			thingyList.remove(0);
		}
		// Expirimentation
		thingyList.get(2).setWordthing("I have been gotten");

	}

}
