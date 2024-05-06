package Final_Variable;

public class MyClass {
	final int x = 3;

	int getResult(int y, int z) {
		if (y >= z) {
			return x + y;
		} else {
//			y = 5;		//uncomment: OK
//			z += 3;		//uncomment: OK
//			z = x / 2;	//uncomment: OK
//			int x = 6;	//uncomment: OK vì int x là khai báo 1 x khác, nếu ghi x = 6 thì báo lỗi
//			x++;		//uncomment: Error vì x++ làm thay đổi giá trị của x
			return x + z;
		}
	}

	public static void main(String[] args) {
		MyClass mc = new MyClass();
		System.out.println(mc.getResult(4, 6));
	}
}
