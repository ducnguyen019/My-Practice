package Polimorphism;

public class MacBookPro extends MacBook {
	@Override
	public void start() {
		System.out.println("Inside MacBookPro start Method");
	}

	@Override
	public void shutdown() {
		System.out.println("Inside MacBookPro shutdown Method");
	}
}
