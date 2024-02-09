package oopsconcepts;

public class inheritance2 {

	public static void main(String[] args) {
		Bike bike=new Bike();
		System.out.println(bike.fuel());
		Bus bus=new Bus();
		System.out.println(bus.fuel());
	}
}
class Vehicle{
	String fuel() {
		return "petrol";
		}
}

class Car extends Vehicle{
	String fuel() {
		return "Disel";
	}
}
class Bike extends Vehicle{
	String fuel() {
		return super.fuel();
	}
}
class Bus extends Vehicle{
	
}