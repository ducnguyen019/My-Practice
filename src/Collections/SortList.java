package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {
	public static void main(String[] args) {
		List<String> l = new ArrayList<>();

		l.add("2");
		l.add("A");
		l.add("X");
		l.add("B");
		System.out.println("Before Sorting: " + l);
		Collections.sort(l, new MyComparator());
		System.out.println("After Sorting: " + l);
	}
}
