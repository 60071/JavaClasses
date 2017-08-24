/**
 * ��@�ɶ��O���G
 * ����G<mm/dd>: <00:00>~<00:00>: <00:00>
 * �{���ؼСG
 * �]�p�W��G
 * �]�p�Q�k�G
 * �����X�G
 *  
 */

/**
 * @author 123
 *
 */
public abstract class GuessGame {
    private int number;
 
    public void setNumber(int number) {
        this.number = number;
    }
 
    public void start() {
        int guess = 0;
        do {
            guess = userInput();
            if (guess > number) {
                bigger();
            }
            else if (guess < number) {
                smaller();
            }
            else {
                right();
            }
        } while (guess != number);
    }
    // ��H��k
    protected abstract void bigger();
    protected abstract void smaller();
    protected abstract void right();
    protected abstract int userInput();
}