package popups.controller;

import popups.view.PopupViewer;

public class PopUpsController
{
	private PopupViewer display;
	
	public PopupController()
	{
		display = new PopupViewer();
	}
	
	public void start()
	{
		display.displayMessage("Look! Words! On the monitor!!!");
	}
}
