package abstractiondemo;

public class abstractclasses {
	public static void main(String[] args) {
//		BMW bmw=new BMW();
		BMWThreeSeries b3=new BMWThreeSeries();
		b3.start();
		b3.accelerate();
		BMWFiveSeries b5=new BMWFiveSeries();
		b5.start();
		b5.accelerate();
		BMW bmw=new BMWThreeSeries();
		bmw.start();
		bmw.accelerate();
	}

}

abstract class BMW{
	void start() {
		System.out.println("BMW started");
	}
	
	abstract void accelerate();
}

class BMWThreeSeries extends BMW{

	@Override
	void accelerate() {
		System.out.println("Three times acceleration..");
	}
	
}

class BMWFiveSeries extends BMW{

	@Override
	void accelerate() {
		System.out.println("Five times acceleration..");
	}
	
}