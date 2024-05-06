package ArrayUtils;

import java.util.Arrays;

public class ArraySort_CustomComparator {

	public static void main(String[] args) {
		String[] s = { "V", "A", "C", "P" };
		Arrays.sort(s, new MyComparator());

		for (String eachString : s) {
			System.out.println(eachString);
		}
	}

}
