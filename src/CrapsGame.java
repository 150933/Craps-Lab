// Implements the game of Craps logic

public class CrapsGame
{
  private int point = 0;

  /**
   *  Calculates the result of the next dice roll in the Craps game.
   *  The parameter total is the sum of dots on two dice.
   *  point is set to the saved total, if the game continues,
   *  or 0, if the game has ended.
   *  Returns 1 if player won, -1 if player lost,
   *  0 if player continues rolling.
   */
  public int processRoll(int total)		//This method creates the rules for the whole craps game which consists of two main phases
  {
	  
	  
	  int result=0; //phase 1 
	  if (point==0) //sets the point value to zero if the sum of the dice causes a win or loose specifically 
		  {
		  
		  
		  
		if ((total==7)||(total==11)) //Condition 1 - if total = 7 or eleven, win
		{
			result=1;
		}
		
		
	  
 	else if((total==2)||(total==3)||(total==12)) //Condition 2 - if total is 2, 3, or 12, loose
		{
			result= -1;
		}
	  
		
		
 	else	//Condition 3 - if sum is not of the results above, sets sum value to the point value.
		{
			point = total;
			result = 0;		//neither win nor loose, but continue to the second phase
		}
		
		
		
		  }
	  else  //phase 2   
	  {
		  
		  
	  
		  if (total==point) // Condition 1 
		  {
			  result=1;     //If the sum is equal to your point value, you win
			  point=0;		//resets the point value to 0
		  }
		  
		  
		  else if (total ==7) //If sum is seven, loose
		  {
			  result=-1;
			  point=0;
		  }
		  
		  
		  else //if neither the two conditions were fulfilled, continue
		  {
			  result=0;
		  }
	  
	  
  }
	  return result;
  }
	  
  /**
   *  Returns the saved point
   */
  public int getPoint()
  {
    return point;
  }
}

