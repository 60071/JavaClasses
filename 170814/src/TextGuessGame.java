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
public class TextGuessGame extends GuessGame {
    private java.util.Scanner scanner;
 
    public TextGuessGame() {
        scanner =
                new java.util.Scanner(System.in);
    }
    // ��@��H��k
    public void bigger() {
        System.out.println(
                "��J�Ʀr����ؼмƦr�j");
    }
    public void smaller() {
        System.out.println(
                "��J�Ʀr����ؼмƦr�p");
    }
    public void right() {
        System.out.println("����!�q���F!");
    }
    public int userInput() {
        System.out.print("��J�Ʀr: ");
        return scanner.nextInt();
    }
}