package Inheritance;

public class Parent {
	Parent() {
		System.out.println("Parents Object" + this); // this trỏ đến object hiện tại (Object c)
	}

	void f1() {
		System.out.println("Inside Parent f1");
	}
}