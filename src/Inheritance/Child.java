package Inheritance;

public class Child extends Parent {
	Child() {
		System.out.println("Child Object" + this); //this trỏ đến object hiện tại (Object c)
	}

	void f2() {
		System.out.println("Inside f2");
	}
}
