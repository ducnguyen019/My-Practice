package ConstructorIntoConstructor;

public class MyClass {
	int x = 3;
	int y = 5;

	// cons 1
	public MyClass() {
		this(4, 8);
	}

	// cons 2
	public MyClass(int x, int y) {
		this.y = y;
	}

	public static void main(String[] args) {
		MyClass mc = new MyClass();
		MyClass mc1 = new MyClass(9, 7);
		System.out.println(mc.x + ", " + mc.y + ", " + mc1.x + ", " + mc1.y);
	}

}
// this(4, 8) sẽ đưa các instance có dạng MyClass() về constructor MyClass(int x, int y)
// Do đó : mc.x trỏ về Cons 2, ở cons 2 thì x lấy default = 3, mc.y lấy this.y = y là 8 của this(4, 8)