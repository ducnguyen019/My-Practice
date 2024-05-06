package Abstract_Class_1;

public class MySub extends MySuper {
	MySub() {
		System.out.println("p");
	}

	public static void main(String[] args) {
		new MySub().printLetter('s');
	}
}
