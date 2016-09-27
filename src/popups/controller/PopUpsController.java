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
		while(count < 10)
		{
		display.displayMessage("Look! Words! On the monitor!!!");
		
		String answer = display.collectResponse("Type your question here :D");
		
		count++;
		}
	}
}
