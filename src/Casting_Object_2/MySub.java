package Casting_Object_2;

public class MySub extends MySuper {
	MySub() {
		x += 2;
		System.out.println("P");
	}

	int myMethod() {
		return x + 4;
	}

	public static void main(String[] args) {
		MySuper ms = new MySub();
		System.out.println(ms.myMethod());
	}
}
