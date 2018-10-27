/**
 * Dice
 * @author rharidas19
 *
 */

public class Dice
{

	private int numRoll;
	{
	}
	
	public Dice()
	{
		numRoll = 0;
	}
	
	public int roll()
	{
		numRoll++;
		int roll = (int)(Math.random()*6) + 1;
		return roll;
	}
	
	public void reset()
	{
		numRoll = 0;
	}
	
	public int getnumRoll()
	{
		return numRoll;
	}
	
}