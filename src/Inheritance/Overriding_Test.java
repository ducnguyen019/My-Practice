package Inheritance;

public class Overriding_Test {

	public static void main(String[] args) {
		Car car = new Car();
		System.out.println(car.fuel());
		Bike bike = new Bike();
		System.out.println(bike.fuel());
	}

}
// Car đã Overrỉde method fuel của Vehicle nên ỉn ra Diesel
// Bike ko ghi đè lên method của Vehicle nên sẽ in ra Petrol