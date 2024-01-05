package utility;

import java.util.Random;

public class SS_JavaUtility {

	public int generateRandomNumber(int range)
	{
		Random random=new Random(range);
		int ranNumber=random.nextInt();
		return ranNumber;
	}
}
