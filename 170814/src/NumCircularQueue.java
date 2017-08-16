

/**
 * 實作時間記錄：
 * 日期：<mm/dd>: <00:00>~<00:00>: <00:00>
 * 程式目標：
 * 一個可放置n個整數的緩衝區
 * 資料依次放置
 * 空間不足時，從第一個整數開始往下覆蓋
 * 設計規格：
 * 建構:傳入長度n，建構一長度n的緩衝區
 * 寫入:整數
 * 輸出:目前在緩衝區的資料，依順序排列
 * 設計想法：
 * 在建構子建構出陣列大小。當指標等於陣列大小，指標歸零
 * 虛擬碼：
 * 宣告陣列和指標
 * 建構陣列大小和指標的值
 * 當指標等於陣列大小，指標歸零
 * 將傳入值存到陣列
 * 讀取陣列裡的資料
 *  
 */

/**
 * @author 123
 *
 */
public class NumCircularQueue {
	//宣告陣列、指標、資料大小
	int circularQueue [] ;
	int length;
	int rear;
	int size;
	//建構陣列大小和指標的值
	NumCircularQueue(int length){
		circularQueue = new int[length];
		rear = -1;
		size = 0;
		this.length = length;
	}
	
	public void EnqueueInt(int en){
		
		if(size >= length){
			rear++;
			//當指標等於陣列大小，指標歸零
			rear = rear % circularQueue.length;
			//將傳入值存到陣列
			circularQueue[rear] = en;
			size = length; 
		}
		else{
			circularQueue[size] = en;
			size++;
			rear = -1;
		}
			
		/*for(int id = 0 ; id < circularQueue.length ; id++){
			System.out.print(circularQueue[id]+" ");
		}
		System.out.print("\n");*/
	}
	public void EnqueueIntArray(int[] en){
		
		//將傳入值存到陣列
		for (int id = 0 ; id < en.length ; id++){
			rear++;
			size++;
			//當指標等於陣列大小，指標歸零
			rear = rear % circularQueue.length;
			circularQueue[rear] = en[id];
		}
		if(size >= length){
			size = length; 
		}
		else{
			rear = -1;
		}
		/*for(int id = 0 ; id < circularQueue.length ; id++){
			System.out.print(circularQueue[id]+" ");
		}
		System.out.print("\n");*/
	}
	public int []Requeue(){
		rear++;
		int data[] = new int[size];
		for(int id = 0 ; id < size ; id++){
			data[id] = circularQueue[(id + rear)%length];
			System.out.print(data[id]+" ");
		}
		return data;
	
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		

	}


}
