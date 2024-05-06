package Abstract_Class_2;

public abstract class MyAbstract {
	String s1 = "N";

	MyAbstract() {
		this("O");
		s1 += "L";
	}

	MyAbstract(String s1) { // s1 này là s1 mới, ko phải s1 của class !!!
		this.s1 += s1; // this.s1 = this.s1 + s1 với this.s1 là s1 của Object tức s1 của class
	}
}
