package Inheritance;

public class Inheritance2demo {

	public static void main(String[] args) {
		Car car=new Car();
		System.out.println(car.fuel());
		Bike bike=new Bike();
		System.out.println(bike.fuel());
		Bus bus=new Bus();
		System.out.println(bus.fuel());
	}
}

class Vehicle{
	String fuel() {
		return "Petrol";
	}
}
class Bus extends Vehicle{
	String fuel() {
		return super.fuel();
	}
}
class Bike extends Vehicle{
	
}

class Car extends Vehicle{
	String fuel() {
		return "Diesel";
	}
}


