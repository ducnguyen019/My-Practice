package Access_Modifier_Package1;

import Access_Modifier_Package2.B;

public class A {
	public static void main(String[] args) {
		B b = new B();
		b.method();
	}
}

/*
 * Vì meThod() của class B là public nên ở class A có thể gọi đc meThod(), trong
 * public method này có chứa public, default, protected, private Var nên các Var
 * này đều gọi ra đc tại class A thông qua public method
 */