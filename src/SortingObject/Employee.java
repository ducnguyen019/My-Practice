package SortingObject;

public class Employee implements Comparable<Employee> {

	int id;
	String name;

	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {

	}

	@Override
	public int compareTo(Employee o) {
		int id1 = this.id;
		int id2 = o.id;
		if (id1 < id2) {
			return -1;
		} else if (id1 > id2) {
			return 1;
		} else {
			return 0;
		}
	}

}
