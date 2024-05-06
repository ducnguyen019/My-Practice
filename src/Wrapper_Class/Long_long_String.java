package Wrapper_Class;

public class Long_long_String {

	public static void main(String[] args) {
		long x = 1000;
		Long y = Long.valueOf(x);   // primitive long sang Wrapper Long
		String s = y.toString();	// Wrapper Long sang String
		Long z = Long.valueOf(s);	// String sang Wrapper Long
		
	}

};