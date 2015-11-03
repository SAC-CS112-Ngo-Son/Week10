
//Son Ngo

import java.util.Random;

public class Dice
{
	private int iUpperLimit;

	public Dice(int num)
	{
		iUpperLimit = 6 * num;
	}

	public int Range()
	{
		return iUpperLimit;
	}

	public int GetANumber()
	{
		Random rand = new Random();
		return rand.nextInt(iUpperLimit) + 1;
	}
}
