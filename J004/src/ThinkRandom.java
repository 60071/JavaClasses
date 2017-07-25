import java.util.Random;

public abstract class ThinkRandom {
	
	protected int getRandomNum()
	{
		Random random = new Random();
		return random.nextInt(10)+1;
	}
	
	public abstract void speakRandomNum();
	
}
