package Collection;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 10; i <= 100; i = i + 10) {
			list.add(i);
		}
		System.out.println("List: " + list);

		list.add(2, 100);
		System.out.println("List After Insert: " + list);

		list.add(3, 200);
		System.out.println("List After Replace: " + list);

		List<Integer> secondList = new ArrayList<>();
		secondList.add(111);
		secondList.add(222);
		secondList.add(333);
		System.out.println("Second List: " + secondList);

		list.addAll(4, secondList);
		System.out.println("First List" + list);

		if (list.contains(222)) {
			System.out.println("List has 222");
		} else {
			System.out.println("List does not have 222");
		}

		System.out.println("Element in List are: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		list.remove(3);
		System.out.println(list);
	}

}
