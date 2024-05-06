package Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Random z = new Random();
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			int num = z.nextInt(5); // Tao ra 10 phan tu nho hon 5
			list.add(num);
		}
		System.out.println("List: " + list);

		Set<Integer> set = new HashSet<>(list); // Loai bo cac trung lap
		System.out.println("Set: " + set);
	}

}
