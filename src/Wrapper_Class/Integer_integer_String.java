package Wrapper_Class;

public class Integer_integer_String {

	public static void main(String[] args) {
		int x = 100;
		String y = Integer.toString(x); // integer sang String

		Integer b = new Integer(y);
		int z = b.intValue(); 			// Integer sang integer

		Integer c = new Integer(z);
		String d = c.toString(); 		// Integer sang String

		int e = Integer.parseInt(d); 	// String sang integer
		
		System.out.println("Hello World".substring(4, 8));
	}

}
