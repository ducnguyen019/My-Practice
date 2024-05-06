package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList2 {
	public static void main(String[] args) {
		List<String> l = new ArrayList<>();

		l.add("2");
		l.add("A");
		l.add("X");
		l.add("B");
		System.out.println("Before Sorting: " + l);
		Collections.sort(l);
		System.out.println("After Sorting: " + l);
		
		int result = Collections.binarySearch(l, "X");
		System.out.println("Index is: " + result);
	}
}
