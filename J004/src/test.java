 
class test {

	private int x, y; // �������Oprivate

	public test(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// ����x�Py���s����k
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public static void main(String[] argv) {
		test a = new test(30, 40);

		// �z�L��k��令����
		a.setX(800);
		a.setY(500);

		// �z�L��k���o������
		System.out.println("����x�G" + a.getX());
		System.out.println("����y�G" + a.getY());
	}
}
