package Casting_Object_1;

public class MySub extends MySuper {
	int i = 3;

	public int method() {
		return 2 * i;
	}

	public static void main(String[] args) {
		MySuper s = new MySub();
		System.out.println(s.i);
		System.out.println(s.method());
	}
}

// s là object của MySuper đc casting lên MySub
// s sẽ lấy thông số của MySuper (i = 5)
// NHƯNG s sẽ lấy method đc override ở class MySub (2 * i với i = 3)