package Static;

public class MyClass {
	static int x = 6;
	int y = 3;

	public MyClass() {
		x += 3;
		y += 2;
	}

	public void method(int i) {
		this.y = y - i;
		x++;

	}

	public static void main(String[] args) {
		MyClass mc1 = new MyClass();
		MyClass mc2 = new MyClass();
		MyClass mc3 = new MyClass();
		mc1.method(3);
		System.out.println("x = " + x);
		System.out.println("y = " + mc1.y);
	}
}
