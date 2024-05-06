package ArrayUtils;

import java.util.Arrays;
import java.util.List;

public class Array_To_List {

	public static void main(String[] args) {
		String[] s = { "V", "A", "C", "P" };
		Arrays.sort(s, new MyComparator());

		for (String eachString : s) {
			System.out.println(eachString);
		}

		List<String> list = Arrays.asList(s);
		s[1] = "Y"; // co the replace
//		list.add("Z"); // Error --> ko the thay doi kich thuoc cua mang khi chuyen doi sang list
		System.out.println(list);
	}

}
