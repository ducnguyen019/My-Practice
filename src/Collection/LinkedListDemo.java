package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {

		Object objects[] = new Object[1000000];
		for (int i = 0; i < objects.length; i++) {
			objects[i] = new Object();
		}

		LinkedList<Object> list1 = new LinkedList<>();
		long start1 = System.currentTimeMillis();
		for (Object object : objects) {
			list1.add(object);
		}
		long end1 = System.currentTimeMillis();
		System.out.println("Time LinkedList taken: " + (end1 - start1));

		List<Object> list2 = new ArrayList<>();
		long start2 = System.currentTimeMillis();
		for (Object object : objects) {
			list2.add(object);
		}
		long end2 = System.currentTimeMillis();
		System.out.println("Time ArrayList taken: " + (end2 - start2));

	}

}
