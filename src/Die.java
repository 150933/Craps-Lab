/*
This class creates the function of the two dice 
 */

public class Die {

	private int NumDots=1; //field 'number of Dots' is initually 1
	private int point; //creates a field named 'point'
	
	
	public void roll() //creates a roll function
	{
		NumDots=(int) ((Math.random()*6)+1); //produces a random value from 1 to 6 (inclusive) for NumDots
	}
	
	public int getNumDots() //creates a getNumDots function
	{	
		return NumDots;  //stores the value of the NumDots
	}
	
	
	
}
