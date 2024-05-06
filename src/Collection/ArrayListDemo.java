package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Integer(20));
		list.add(10);
		list.add(30.4);
		list.add("Hello");
		System.out.println(list);

//		// Generic
//		ArrayList<Integer> list1 = new ArrayList<>();
//		list1.add(new Integer(20));
//		list1.add(10);
//		list1.add(30.4);
//		list1.add("Hello");
//		System.out.println(list1);

		// Iterator
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(list);
	}

}
