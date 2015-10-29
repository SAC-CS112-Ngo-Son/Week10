import java.util.Random;

public class RandomNumber
{

	public int GetANumber()
	{
		Random rand = new Random();
		return rand.nextInt(10) + 1;
	}
	
}
