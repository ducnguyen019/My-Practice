package Abstract_Class_2;

public class MyClass extends MyAbstract {
	MyClass() {
		this(2);
		s1 += 7;
	}

	MyClass(int x) {
		s1 += x;
	}

	public static void main(String[] args) {
		MyClass mc = new MyClass();
		System.out.println(mc.s1);
	}
}
