package InstanceVar_LocalVar_ClassVar;

public class Employee {
	String name; // Instance Variablle
	double grossSalary = 3300; // Instance Variable
	static int numberEmployees = 300; // Class Variable

	double getNetSalary() {
		double taxRate = 0.30; // Local Variable
		double netSalary = grossSalary * (1 - taxRate);
		return netSalary;
	}

	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println(emp.grossSalary); // Goi ra Instance Variable - phải gọi từ Object của class
		System.out.println(Employee.numberEmployees); // Goi ra Class Variable - gọi thẳng từ tên class
	}													// mà ko cần tạo Object trước
}
