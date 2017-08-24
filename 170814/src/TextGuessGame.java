/**
 * 實作時間記錄：
 * 日期：<mm/dd>: <00:00>~<00:00>: <00:00>
 * 程式目標：
 * 設計規格：
 * 設計想法：
 * 虛擬碼：
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
    // 實作抽象方法
    public void bigger() {
        System.out.println(
                "輸入數字比較目標數字大");
    }
    public void smaller() {
        System.out.println(
                "輸入數字比較目標數字小");
    }
    public void right() {
        System.out.println("恭喜!猜中了!");
    }
    public int userInput() {
        System.out.print("輸入數字: ");
        return scanner.nextInt();
    }
}