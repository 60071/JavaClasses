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
public class StarbuzzCoffee {
 	public static void main(String args[]) {
 		Beverage beverage = new Espresso();
 		System.out.println(beverage.getDescription()
 			+ " $" + beverage.cost());
 		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() 
				+ " $" + beverage2.cost());
 	 }
}
