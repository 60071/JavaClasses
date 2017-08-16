

/**
 * ��@�ɶ��O���G
 * ����G<mm/dd>: <00:00>~<00:00>: <00:00>
 * �{���ؼСG
 * �@�ӥi��mn�Ӿ�ƪ��w�İ�
 * ��ƨ̦���m
 * �Ŷ������ɡA�q�Ĥ@�Ӿ�ƶ}�l���U�л\
 * �]�p�W��G
 * �غc:�ǤJ����n�A�غc�@����n���w�İ�
 * �g�J:���
 * ��X:�ثe�b�w�İϪ���ơA�̶��ǱƦC
 * �]�p�Q�k�G
 * �b�غc�l�غc�X�}�C�j�p�C����е���}�C�j�p�A�����k�s
 * �����X�G
 * �ŧi�}�C�M����
 * �غc�}�C�j�p�M���Ъ���
 * ����е���}�C�j�p�A�����k�s
 * �N�ǤJ�Ȧs��}�C
 * Ū���}�C�̪����
 *  
 */

/**
 * @author 123
 *
 */
public class NumCircularQueue {
	//�ŧi�}�C�B���СB��Ƥj�p
	int circularQueue [] ;
	int length;
	int rear;
	int size;
	//�غc�}�C�j�p�M���Ъ���
	NumCircularQueue(int length){
		circularQueue = new int[length];
		rear = -1;
		size = 0;
		this.length = length;
	}
	
	public void EnqueueInt(int en){
		
		if(size >= length){
			rear++;
			//����е���}�C�j�p�A�����k�s
			rear = rear % circularQueue.length;
			//�N�ǤJ�Ȧs��}�C
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
		
		//�N�ǤJ�Ȧs��}�C
		for (int id = 0 ; id < en.length ; id++){
			rear++;
			size++;
			//����е���}�C�j�p�A�����k�s
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
		// TODO �۰ʲ��ͪ���k Stub
		

	}


}
