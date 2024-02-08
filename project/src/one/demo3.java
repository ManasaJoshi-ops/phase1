package one;

public class demo3 {
	
	public static void main(String args[]) {
		System.out.println("from main method");
		//create instance of class to print the contents and non static block
		
//		demo3 obj=new demo3();
//		demo3 obj2=new demo3();
		Car car=new Car();
		System.out.println(car.Color);
		System.out.println(car.numOfWheels);
		System.out.println(Car.manufacturer);
		//static variable(so can be printed with class name
		
		
	}
	//constructor
	public demo3() {
		System.out.println("from constructor");
	}
	//non static block
	{
		System.out.println("from non static block");
	}
	static {
		System.out.println("static block");
	}
	
}
