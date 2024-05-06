public class StaticMethodsDemo {

	public static void main(String[] args) {
		System.out.println("Inside main");
		StaticMethodsDemo.method();
	}

	static void method() {
		System.out.println("Inside method 1");
	}
	
	static {
		System.out.println("Inside the static block");
		StaticMethodsDemo.method();
	}
}

/* ket qua la static block chay trc, sau do moi toi main*/
