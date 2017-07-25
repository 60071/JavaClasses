

/**
 * 實作時間記錄：07/17
 * 日期：<mm/dd>: <16:30>~<17:30>: <01:00>
 * 程式目標：請使用Math.random()，產生0到9的亂數，並計算在執行10次，100次，1000次的情形下，每個數字出現的比例。
 * 設計規格：輸入:無。輸出:出現比例，請用兩位小數點百分比呈現。
 * 設計想法：
 * 虛擬碼：
 * 在Random類別定義整數i用來儲存亂數
 * 定義整數矩陣count用來儲存0~9產生個數。
 * 在Random類別定義方法value回傳亂數0~9
 * 定義方法add將產生個數+1儲存到矩陣count並回傳
 * 定義方法result回傳目前的矩陣。
 * 建立三個Random物件，random1、random2、random3
 * 分別以迴圈執行10次、100次、1000次。
 * 在迴圈裡呼叫value方法將回傳亂數值儲存在區域變數box裡
 * 再以box的參數呼叫add方法將產生個數+1儲存到矩陣count並回傳。
 * 最後以迴圈將計算後的結果輸出。
 *  
 */

/**
 * @author 123
 *
 */
public class Random {
	//在Random類別定義整數i用來儲存亂數
	private int i = 0;
	//定義整數矩陣count用來儲存0~9產生個數
	private int count[] = new int[10];
	
	//在Random類別定義方法value回傳亂數0~9
	public int value (){
		return i = (int)(Math.random()*10);
	}
	//定義方法add將產生個數+1儲存到矩陣count並回傳
	public int add (int i){
		/*for (int id = 0; id < 10; id++) {
			System.out.println(count[id]);
		}*/
		return count[i] = count[i]+1;
	}
	//定義方法result回傳目前的矩陣
	public int result (int i){
			return count[i];
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		
		//建立三個Random物件，random1、random2、random3
		Random random1 = new Random();
		Random random2 = new Random();
		Random random3 = new Random();
		
		//分別以迴圈執行10次、100次、1000次
		for (int id = 0; id < 10; id++) {
			//在迴圈裡呼叫value方法將回傳亂數值儲存在區域變數box裡
			int box = random1.value();
			//再以box的參數呼叫add方法將產生個數+1儲存到矩陣count並回傳
			random1.add(box);
			System.out.println(box);
		}
		for (int id = 0; id < 100; id++) {
			int box = random2.value();
			random2.add(box);
			System.out.println(box);
		}
		for (int id = 0; id < 1000; id++) {
			int box = random3.value();
			random3.add(box);
			System.out.println(box);
		}
		//最後以迴圈將計算後的結果輸出
		for (int id = 0; id < 10; id++) {
			System.out.printf(id+"的機率是: %.2f \n", ((double)random1.result(id))/10*100);
		}
		for (int id = 0; id < 10; id++) {
			System.out.printf(id+"的機率是: %.2f \n", ((double)random2.result(id))/100*100);
		}
		for (int id = 0; id < 10; id++) {
			System.out.printf(id+"的機率是: %.2f \n", ((double)random3.result(id))/1000*100);
		}
		
		
		
		
		

	}

}
