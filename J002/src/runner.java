
public class runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		Parent parent = new Parent("Jack");
		parent.whoAmI();
		
		Child child = new Child("Lois");
		child.whoAmI();
		
		Parent anotherChild = new Child("Jhon");
		anotherChild.whoAmI();

	}

}
