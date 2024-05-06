package Wrapper_Class;

public class Integer_integer {

	public static void main(String[] args) {
		int x = 100;
		Integer y = Integer.valueOf(x);	// integer sang Integer
		System.out.println(y);
		int z = y.intValue();			// Integer sang integer
		System.out.println(z);
	}

}
