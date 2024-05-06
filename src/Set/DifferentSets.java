package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class DifferentSets {

	public static void main(String[] args) {
		Random obj = new Random();
		HashSet set1 = new HashSet<>(); // Sap xep ngau nhien ko theo thu tu
		LinkedHashSet set2 = new LinkedHashSet<>(); // Sap xep theo thu tu nhu ban dau random
		Set<Integer> set3 = new TreeSet<>(); // Sap xep theo thu tu tu nho toi lon
		for (int i = 1; i <= 5; i++) {
			int num = obj.nextInt(100);
			set1.add(num);
			set2.add(num);
			set3.add(num);
			System.out.println(num);
		}
		System.out.println("HashSet: " + set1);
		System.out.println("LinkedSet: " + set2);
		System.out.println("Set: " + set3);
	}

}
