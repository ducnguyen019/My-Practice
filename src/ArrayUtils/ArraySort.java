package ArrayUtils;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int[] a = { 40, 10, 15, 7 };
		System.out.println("Before sort: ");
		for (int eachElement : a) {
			System.out.println(eachElement);
		}

		Arrays.sort(a);
		System.out.println("After sort: ");
		for (int eachElement : a) {
			System.out.println(eachElement);
		}
	}

}
