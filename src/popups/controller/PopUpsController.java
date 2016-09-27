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
		display.displayMessage("Look! Words! On the monitor!!!");
		
		answer = display.collectResponse("Type your question here :D");
		
		count++;
		}
	}
}
