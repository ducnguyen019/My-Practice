package Wrapper_Class;

public class byte_String {

	public static void main(String[] args) {
		byte x = 100;
		String s = Byte.toString(x); // byte sang String
		System.out.println(x);
		byte y = Byte.parseByte(s); // String sang byte
		System.out.println(y);
	}
}
