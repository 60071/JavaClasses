 
class test {

	private int x, y; // 成員都是private

	public test(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// 成員x與y的存取方法
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

		// 透過方法更改成員值
		a.setX(800);
		a.setY(500);

		// 透過方法取得成員值
		System.out.println("成員x：" + a.getX());
		System.out.println("成員y：" + a.getY());
	}
}
