/*�o�P(Licensing)�B�~�P(Shuffle)�B���J�P(Poker)
�o�P��(Dealer)
���J�P�����W�١G����(heart)�B�®�(spade)�B��D(diamond)�B����(clubs)
 */
import java.util.Random;

public class Dealer {
	static String[] Poker = { "����", "�®�", "��D", "����" };
	static int range;

	public static String Shuffle() {
		Random random = new Random();
		int i = random.nextInt(Poker.length);
		String element = Poker[i];
		range = random.nextInt(13) + 1;
		return element + range;
	}

	public void Licensing() {
	}

}
