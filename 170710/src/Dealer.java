/*發牌(Licensing)、洗牌(Shuffle)、撲克牌(Poker)
發牌者(Dealer)
撲克牌的花色名稱：紅心(heart)、黑桃(spade)、紅D(diamond)、梅花(clubs)
 */
import java.util.Random;

public class Dealer {
	static String[] Poker = { "紅心", "黑桃", "紅D", "梅花" };
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
