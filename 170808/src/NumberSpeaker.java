import java.util.Arrays;

/**
 * 實作時間記錄：
 * 日期：<08/08>: <10:50>~<00:00>: <10:00> <25:00>
 * 程式目標：
 * 	利用本程式來展示Unit test的做法
 *   
 * 設計規格：
 * 	基本：命令列：請輸入數字(ex: 123)，輸出：一百二十三
 * 設計想法：
 * 	程式的核心是一個翻譯器，把阿拉伯數字翻成中文
 * 	先寫Test Case
 * 虛擬碼：
 *  
 */

/**
 * @author ganrqunx
 *
 */
public class NumberSpeaker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}
	public String transScriptOf(int num) {
		int a = 0;
		int b = 0;

		boolean isNegative = false;
		if(num <0) {
			isNegative = true;
		}
		
		String [ ] digitItem = {"零","十","百","千","萬","十","百","千","億","十"};
		String [ ] constantItem = {"","一","二","三","四","五","六","七","八","九"};
		String result ="";
		
		if (isNegative == true){
			num = Math.abs(num);
			result = "負";
		}
		
		while(num >= 0){
			//than等於上回次方的值
			int than = b;
			//次方歸0
			b = 0;
			//做初次判斷
			if (num >=10){
				a = num / 10;
				b = b + 1;
			}
			//個位數或零的情況
			if (num < 10)
				a = num;
			//取得最高次方常數與最高次方 ex 495 a = 4 b = 2
			while(a >= 10){
				a = a / 10;
				b = b + 1;
			}
			//傳入值0和中間0的判斷
			if(than != 0)
				//中間沒有0代表than與b只相差1
				than = than - b;
			if(b == 0 && than != 1 && than != 0)
				result += digitItem[b] + constantItem[a];
			else if(a != 0 && b == 0 && than == 0)
				result += constantItem[a];
			else if(b == 0 && than != 1)
				result += digitItem[0];
			else if(than > 0 && than != 1)
				result += digitItem[0];
			else if(b == 0)
				result += constantItem[a];
			//兩的判斷
			if(b!=0 && a == 2 && 0 != "十".indexOf(digitItem[b]))
				result += "兩" + digitItem[b];
			else if(b != 0)
				result += constantItem[a] + digitItem[b];
			//十的判斷
			if(3 >= result.length() && 0 == "十".indexOf(digitItem[b]))
				result = result.replace("一","");
			//萬的判斷
			if(b >= 4 && b <= 7) {
				result = result.replace("萬",""); 
				result += "萬";
			}
			//億的判斷
			if(b >= 8 && b <= 10) {
				result = result.replace("億",""); 
				result += "億";
			}
			//ex 945 - 900  以此類推
			num = num - a * (int)Math.pow(10,b);
			//System.out.println(num);
			//最終num等於0，跳出迴圈用
			if(num == 0)
				num--;
		}
		System.out.println(result);
		
		return result;
		
		
	}

}
