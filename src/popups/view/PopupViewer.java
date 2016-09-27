package popups.view;

import javax.swing.JOptionPane;

public class PopupViewer
{
	/**
	 * Creates a popu to show the user a String.
	 * @param message The String to show the user.
	 */
	public void displayMessage(String message)
	{
		JOptionPane.showMessageDialog(null, message);
	}
	
	/**
	 * Creates a popup to ask a question to the user. Stores the response
	 * as a String
	 * @param question The question supplied to the user.
	 * @return The users response as a String.
	 */
	
	public String collectResponse(String question)
	{
		String response = " ";
		
		response = JOptionPane.showInputDialog(null, question);
		
		return response;
	}
}
