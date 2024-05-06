
public class NonStaticMembersDemo {

	int num;

//constructor
	NonStaticMembersDemo() {
		System.out.println("Inside the constructor");
	}

//non-static block
	{
		System.out.println("Inside the non static block");
	}

	public static void main(String[] args) {
		System.out.println("Inside the main method");
		NonStaticMembersDemo obj = new NonStaticMembersDemo();

		obj.doSomething();
	}

//static block
	static {
		System.out.println("Inside the static block");
	}

	void doSomething() {
		System.out.println("Inside doSomething");
	}
}
