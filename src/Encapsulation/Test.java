package Encapsulation;
import Encapsulation.Customer;

public class Test {

	public static void main(String[] args) {
		Customer c = new Customer();
		c.setFirstName("Nguyen");
		c.setLastName("Duc");
		c.setCreditCard("12345");
		
		System.out.println("First Name: " + c.getfirstName());
		System.out.println("Last Name: " + c.getfirstName());
		System.out.println("Credit Card: " + c.getCreditCard());
	}

}
 