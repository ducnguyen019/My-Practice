package Exception;

public class MyClass {
	public static void test(String s1) {
		if (s1 == null) {
			throw new NullPointerException();
		} else {
			throw new RuntimeException();
		}
	}

	public static void main(String[] args) {
		try {
			System.out.println("A");
			test("");
		} catch (NullPointerException e) {
			System.out.println("B");
		} catch (Exception e) {
			System.out.println("C");
		} finally {
			System.out.println("D");
		}
	}
}
