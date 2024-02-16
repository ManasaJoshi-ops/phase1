package inheritance;

public class multipleinheritance {
	public static void main(String[] args) {
		//multiple inheritance using extends is not allowed in java, we can use interfaces instead
//		TV tv=new TV();
//		tv.start();
//		Monitor monitor=new Monitor();
//		monitor.start();
		
		Desktop desktop=new Desktop();
		desktop.powerOn();
		desktop.turnoff();
	}

}

class ElectronicDevices{
	public void start() {
		System.out.println("Device Started..");
	}
}

class TV extends ElectronicDevices{
	public void start() {
		System.out.println("TV started..");
	}
}
class Monitor extends ElectronicDevices{
	public void start() {
		System.out.println("Monitor started..");
	}
}

class Desktop implements I1,I2{

	@Override
	public void powerOn() {
		I1.super.powerOn();
		I2.super.powerOn();
	}
	public void turnoff() {
		I1.super.off();
		I2.super.switchoff();
	}
	
}
