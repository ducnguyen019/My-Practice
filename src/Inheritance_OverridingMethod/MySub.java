package Inheritance_OverridingMethod;

public class MySub extends MySuper {
	char c2 = 'A';

	MySub() {
		this('N');
		System.out.println(c2);
	}

	MySub(char c) {
		System.out.println(c);
	}

	@Override
	void method() {
		super.method();
		System.out.println(c2);
	}

	public static void main(String[] args) {
		MySub mySub = new MySub();
		mySub.method();
	}
}
