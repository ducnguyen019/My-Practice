package Static;

// Static Variable & Instance Variable

public class Employee {
	int z; // instance variable
	static int staticZ; // class or static variable

	public Employee() {
		z++;
		staticZ++;
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();

		System.out.println(Employee.staticZ);
		System.out.println(emp1.z);
		System.out.println(emp2.z);
		System.out.println(emp3.z);
	}
}

/* biến staticZ là biến của cả class, nên khi tạo lần lượt 3 Object emp1, 2, 3 thì staticZ được + thêm 1 mỗi lần,
 *  kq là staticZ = 3;
 * biến z là biến instance, tức là biến z là biến của Object, các object ko liên quan tới nhau, nên dù tạo 3 lần 
 * 	Object thì z vẫn cứ +1 vào riêng mỗi lần, kq là z = 1, z = 1, z = 1
 */
