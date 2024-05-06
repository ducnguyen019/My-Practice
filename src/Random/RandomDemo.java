package Random;

import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		Random obj = new Random();
		int z = obj.nextInt();
		System.out.println("Z: " + z);

		int y = obj.nextInt(100); // Random so <= 100
		System.out.println("Y: " + y);
	}
}
