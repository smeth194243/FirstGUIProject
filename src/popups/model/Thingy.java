package popups.model;

public class Thingy
{
	private int numberthing;
	private double valuething;
	private String wordthing;
	private boolean isvalidthing;
	
	public Thingy()
	{
		this.numberthing = 666;
		this.valuething = 12345;
		this.wordthing = "I am a string.";
		this.isvalidthing = true;
	}
	//Getters---------------------------------
	
	public int getNumberthing()
	{
		return numberthing;
	}
	
	public double getValuething()
	{
		return valuething;
	}
	
	public String getWordthing()
	{
		return wordthing;
	}
	
	public boolean getIsvalidthing()
	{
		return isvalidthing;
	}
	
	//Setters----------------------------------
	
	public void setNumberthing(int numberthing);
	
	public void setValuething(double valuething);
	
	public void setWordthing(String wordthing);
	
	public void setIsvalidthing(boolean isvalidthing);
}
