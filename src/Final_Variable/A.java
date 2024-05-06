package Final_Variable;

public final class A {
	final float pi = 3.14f;

	public static void main(String[] args) {
		A a1 = new A();
		// a1.pi=3.25f; //ko the gan pi = 3.25 vi da final pi = 3.14 o tren
	}
}
// tuong tu voi method cung vay, ko the override method final duoc