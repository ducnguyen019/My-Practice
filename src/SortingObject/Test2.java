package SortingObject;

import java.util.Set;
import java.util.TreeSet;

public class Test2 {

	public static void main(String[] args) {
		Set<Employee> set = new TreeSet<>(new EmployeeNameComparator());
		set.add(new Employee(100, "Obama"));
		set.add(new Employee(400, "Tom"));
		set.add(new Employee(300, "Duc"));
		set.add(new Employee(200, "An"));

		for (Employee emp : set) {
			System.out.println(emp.id);
			System.out.println(emp.name);
		}
	}

}
