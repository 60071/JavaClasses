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
    // 抽象方法
    protected abstract void bigger();
    protected abstract void smaller();
    protected abstract void right();
    protected abstract int userInput();
}