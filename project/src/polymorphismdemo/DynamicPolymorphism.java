package polymorphismdemo;

public class DynamicPolymorphism {
	public static void main(String[] args) {
		//method overriding
		Macbook mc=new MacBookAir();
		mc.start();
		mc.shutdown();
		Macbook mc2=new MacBookPro();
		mc2.start();
		mc2.shutdown();
	}

}

class Macbook{
	void start() {
		System.out.println("MacBook started..");
	}
	void shutdown() {
		System.out.println("MacBook shutdown..");
	}
}

class MacBookAir extends Macbook{
	void start() {
		System.out.println("MacBookAir started..");
	}
	void shutdown() {
		System.out.println("MacBookAir shutdown..");
	}
}
class MacBookPro extends Macbook{
	void start() {
		System.out.println("MacBookPro started..");
	}
	void shutdown() {
		System.out.println("MacBookPro shutdown..");
	}
}
