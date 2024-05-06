package Nested_Class;

public class Outer {
	private int a = 2;

	Outer() {
		a += 4;
	}

	class Inner {
		Inner() {
			a++;
		}
	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		Inner inner = outer.new Inner();
		System.out.println(outer.a);
	}
}
