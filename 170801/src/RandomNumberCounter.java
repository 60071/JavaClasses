import java.util.ArrayList;

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
public class RandomNumberCounter {
	private int[] count;
	private int[] item;
	private double[] probability;
	private int i;
	private int minNum;
	private int maxNum;
	private int rollTimes;
	private boolean istrue;
	
	RandomNumberCounter(int minNum, int maxNum, int rollTimes){
		this.maxNum = maxNum;
		this.minNum = minNum;
		this.rollTimes = rollTimes;
		this.count = new int[rollTimes];
		istrue = excute(1,10,100);
		
		
	}
	
	public int[] allHitCounts(){
		allNumbers();
		item = new int[maxNum+1];
		
		for (int id = 0; id < rollTimes; id++) {
			item[count[id]] = item[count[id]]+1;
		}
		for (int id = 1; id <= maxNum; id++) {
			System.out.println(id+"�����榸��:"+item[id]);
		}
		return item ;
		
	}
	public double[] allHitPercents(){
		allNumbers();
		probability = new double[maxNum+1];
		
		for (int id = 0; id < rollTimes; id++) {
			probability[count[id]] = probability[count[id]]+1;
		}
		
		for (int id = 1; id <= maxNum; id++) {
			System.out.println(id+"�����v:"+probability[id]/rollTimes*100+"%");
		}
		return probability;
		
	}
	public int hitCountOf(int number){
		allHitCounts();
		System.out.println(number+"�����榸��:"+item[number]);
				
		return number;
		
	}
	public double hitPercentOf(int number){
		allHitPercents();
		System.out.println(number+"�����v:"+probability[number]);
		
		return number;
		
	}
	public int[] allNumbers(){
		if(istrue == true){
			for (int id = 0; id < rollTimes; id++) {
				this.i = (int)(Math.random()*10+minNum);
				count[id] = i;
				//System.out.println(count[id]);
			}
			
		}
		return count;
		
	}
	boolean excute(int minNum, int maxNum, int rollTimes){
		if(minNum>=maxNum&&rollTimes<1){
			System.out.println("false");
			return false;
		}
		else{
			System.out.println("true");
			return true;
		}
		
		
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		RandomNumberCounter randomNumberCounter = new RandomNumberCounter(1,10,100);
		
		//randomNumberCounter.allHitCounts();
		//randomNumberCounter.allNumbers();
		//randomNumberCounter.allHitPercents();
		randomNumberCounter.hitCountOf(1);
		randomNumberCounter.hitPercentOf(1);

	}

}
