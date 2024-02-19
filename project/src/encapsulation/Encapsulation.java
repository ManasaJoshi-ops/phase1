package encapsulation;

public class Encapsulation {
	public static void main(String[] args) {
		Car car=new Car();
		car.setColor("red");
		System.out.println(car.getColor());
		System.out.println(car.getNumOfWheels());
	}

}
class Car{
	private String color;
	private int numofwheels;
	private boolean customisable;
	public static String manufacturer="Honda";
	public Car() {
		numofwheels=4;
		color="white";
		customisable=true;
	}
	public String getColor() {
		return color;
		
	}
	public int getNumOfWheels() {
		return numofwheels;
	}
	public void setColor(String color) {
		if(customisable) {
			this.color=color;
		}
	}
	public void setNumOfWheels(int numofwheels) {
		this.numofwheels=numofwheels;
	}
}
