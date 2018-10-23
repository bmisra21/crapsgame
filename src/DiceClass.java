
public class DiceClass 
{
	//fields
	private int numRolls;
	//private int sides;
	
	//constructors
	public DiceClass () 
	{
		numRolls = 0;
		//sides = 6; 
	}
	
	//methods
	public int getRolls() 
	{
		return numRolls;
	}
	
	public int roll()
	{
		numRolls ++;
		return (int)(Math.random()*6)+1;
		
	}
	
	public void reset()
	{
		numRolls = 0;
	}
	
}

