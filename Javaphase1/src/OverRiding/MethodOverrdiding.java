package OverRiding;

public class MethodOverrdiding {

	public static void main(String[] args) {
		Bus bus=new Bus(1,4,2,3);
		bus.fuel();
	}
}

class Vehicle{
	
	int a, b;
	Vehicle(int a, int b){
		this.a=a;
		this.b=b;
	}
	
	
	void fuel() {
		System.out.println("Petrol");
		
	}
}

class Bus extends Vehicle{
	
	int c,d;
	Bus(int a,int b,int c, int d){
		super(a,b);
		this.c=c;
		this.d=d;
	}
}
//
//class Bike extends Vehicle{
//
//	
//	
//}
