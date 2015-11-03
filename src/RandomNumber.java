import java.util.Random;

public class RandomNumber
{
	
	/*public int GetANumber()
	{
		Random rand = new Random();
		return rand.nextInt(10) + 1;
	}
	
	public int GetANumber(int high)
	{
		Random rand = new Random();
		return rand.nextInt(high + 1);
	}
	
	public int GetANumber(int lo, int hi)
	{
		Random rand = new Random();
		return rand.nextInt(hi - lo + 1) + lo;
	}*/
	
	//LAB 4
	/*private int iLo, iHi;
	
	public void SetLowNumber(int low)
	{
		iLo = low;
	}
	
	public void SetHighNumber (int high)
	{
		iHi = high;
	}
	
	public int GetANumber()
	{
		Random rand = new Random();
		return rand.nextInt(iHi - iLo + 1) + iLo;
	}*/
	
	//LAB 5
	/*private int iHigh;
	
	public RandomNumber (int high)
	{
		iHigh = high;
	}
	
	public int GetANumber()
	{
		Random rand = new Random();
		return rand.nextInt(iHigh + 1);
	}*/
	
	//LAB 6
	private int iHigh, iLow;
	
	public RandomNumber (int low, int high)
	{
		iLow = low;
		iHigh = high;
	}
	
	public int GetANumber()
	{
		Random rand = new Random();
		return rand.nextInt(iHigh - iLow + 1) + iLow;
	}
	
	public int GetLowNumber()
	{
		return iLow;
	}
	
	public int GetHighNumber()
	{
		return iHigh;
	}
}
