package Polimorphism;

public class RunTimeBinding {

	public static void main(String[] args) {
		AppleLaptop m1 = new MacBookPro();
		AppleLaptop m2 = new MacBookAir();

		m1.start();
		m1.shutdown();

//		MacBookPro m3 = (MacBookPro) m1; // Co the ep kieu Object ( Upcast & DownCast)

		m2.start();
		m2.shutdown();

//		MacBookAir m4 = (MacBookAir) m2; // Co the ep kieu Object ( Upcast & DownCast)

	}

}
