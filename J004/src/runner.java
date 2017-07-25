
public class runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ChineseSpeaker chineseSpeaker = new ChineseSpeaker();
		EnglishSpeaker englishSpeaker = new EnglishSpeaker();

		for (int id = 0; id < 10; id++) {
			chineseSpeaker.speakRandomNum();
		}
		for (int id = 0; id < 10; id++) {
			englishSpeaker.speakRandomNum();
		}

	}

}
