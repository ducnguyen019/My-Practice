package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseCollection {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(8);
		l.add(50);
		l.add(78);

		System.out.println("Before Reverse: " + l);
		Collections.reverse(l);
		System.out.println("After Reverse: " + l);
	}
}
