

/**
 * ��@�ɶ��O���G07/17
 * ����G<mm/dd>: <16:30>~<17:30>: <01:00>
 * �{���ؼСG�Шϥ�Math.random()�A����0��9���üơA�íp��b����10���A100���A1000�������ΤU�A�C�ӼƦr�X�{����ҡC
 * �]�p�W��G��J:�L�C��X:�X�{��ҡA�ХΨ��p���I�ʤ���e�{�C
 * �]�p�Q�k�G
 * �����X�G
 * �bRandom���O�w�q���i�Ψ��x�s�ü�
 * �w�q��Ưx�}count�Ψ��x�s0~9���ͭӼơC
 * �bRandom���O�w�q��kvalue�^�Ƕü�0~9
 * �w�q��kadd�N���ͭӼ�+1�x�s��x�}count�æ^��
 * �w�q��kresult�^�ǥثe���x�}�C
 * �إߤT��Random����Arandom1�Brandom2�Brandom3
 * ���O�H�j�����10���B100���B1000���C
 * �b�j��̩I�svalue��k�N�^�Ƕüƭ��x�s�b�ϰ��ܼ�box��
 * �A�Hbox���ѼƩI�sadd��k�N���ͭӼ�+1�x�s��x�}count�æ^�ǡC
 * �̫�H�j��N�p��᪺���G��X�C
 *  
 */

/**
 * @author 123
 *
 */
public class Random {
	//�bRandom���O�w�q���i�Ψ��x�s�ü�
	private int i = 0;
	//�w�q��Ưx�}count�Ψ��x�s0~9���ͭӼ�
	private int count[] = new int[10];
	
	//�bRandom���O�w�q��kvalue�^�Ƕü�0~9
	public int value (){
		return i = (int)(Math.random()*10);
	}
	//�w�q��kadd�N���ͭӼ�+1�x�s��x�}count�æ^��
	public int add (int i){
		/*for (int id = 0; id < 10; id++) {
			System.out.println(count[id]);
		}*/
		return count[i] = count[i]+1;
	}
	//�w�q��kresult�^�ǥثe���x�}
	public int result (int i){
			return count[i];
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		
		//�إߤT��Random����Arandom1�Brandom2�Brandom3
		Random random1 = new Random();
		Random random2 = new Random();
		Random random3 = new Random();
		
		//���O�H�j�����10���B100���B1000��
		for (int id = 0; id < 10; id++) {
			//�b�j��̩I�svalue��k�N�^�Ƕüƭ��x�s�b�ϰ��ܼ�box��
			int box = random1.value();
			//�A�Hbox���ѼƩI�sadd��k�N���ͭӼ�+1�x�s��x�}count�æ^��
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
		//�̫�H�j��N�p��᪺���G��X
		for (int id = 0; id < 10; id++) {
			System.out.printf(id+"�����v�O: %.2f \n", ((double)random1.result(id))/10*100);
		}
		for (int id = 0; id < 10; id++) {
			System.out.printf(id+"�����v�O: %.2f \n", ((double)random2.result(id))/100*100);
		}
		for (int id = 0; id < 10; id++) {
			System.out.printf(id+"�����v�O: %.2f \n", ((double)random3.result(id))/1000*100);
		}
		
		
		
		
		

	}

}
