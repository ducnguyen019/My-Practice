package Inheritance_DifferentPackage_2;

import Inheritance_DifferentPackage_1.MySuper;

public class MySub extends MySuper {
	public static void main(String[] args) {
		MySuper mySuper = new MySuper();
		MySub mySub = new MySub();
		System.out.println(mySuper.s1); // Thấy s1, vì s1 là public nên có thể thấy đc ngoài Package
		System.out.println(mySub.s1); 	// Thấy s1, vì s1 là public và gọi từ Obj của subclass
//		System.out.println(mySuper.s2); // Ko thấy s2, vì s2 là protected & gọi từ Obj của class cha + ngoài Package
		System.out.println(mySub.s2);	// Thấy s2, vì s2 là protected và gọi từ Obj của subclass + ngoài Package
//		System.out.println(mySuper.s3);	// Ko thấy s3, vì s3 là default và nằm ngoài Package
//		System.out.println(mySuper.s4); // Ko thấy s4, vì s4 là private và nằm ngoài Package
	}
}
