package More_Inheritance_Concept;

public class Child extends Parent {
	int c, d;

	Child(int a, int b, int c, int d) {
		super(a, b); // super phai ghi dau tien truoc khi tao cac tham so cua class con
		this.c = c;
		this.d = d;

	}
	void displayDetails() {
		System.out.println("Parent a" + super.a);
		System.out.println("Parent b" + super.b);
		System.out.println("Child c" + this.c);
		System.out.println("Child d" + this.d);
	}
	void f1() {
		super.f1();
		System.out.println("Inside Child f1()");
	}
}
// super cho phép ta truy cập các method của class cha tại class con