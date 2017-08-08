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
		// TODO Auto-generated method stub

	}
	public String transScriptOf(int num) {
		int a = 0;
		int b = 0;
//		 * 輸入值若小於零，則註記為負isNegative
		boolean isNegative = false;
		if(num <0) {
			isNegative = true;
		}
		//先把傳入整數化為a*10^b的總合
		
		String [ ] digitItem = {"零","十","百","千","萬","十","百","千","億","十","百"};
		String [ ] constantItem = {"","一","二","三","四","五","六","七","八","九"};
		String result ="";
		
		if (isNegative == true){
			num = Math.abs(num);
			result = "負";
		}
		
		while(num >= 0){
			int than = b;
			b = 0;
			if (num >=10){
				a = num / 10;
				b = b + 1;
			}
			if (num < 10)
				a = num;
			while(a >= 10){
				a = a / 10;
				b = b + 1;
			}
			if(than != 0)
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
			
			if(b!=0 && a == 2 && 0 != "十".indexOf(digitItem[b]))
				result += "兩" + digitItem[b];
			else if(b != 0)
				result += constantItem[a] + digitItem[b];
			
			num = num - a * (int)Math.pow(10,b);
			//System.out.println(num);
			if(num == 0)
				num--;
		}
		System.out.println(result);
		
		
//		 * 先把傳入整數化為a*10^b的總合
		/*
		 * 寫一個函數，回傳兩個整數矩陣：10的幾次方跟前面的
		 */
		return result;
		
		
	}

}
