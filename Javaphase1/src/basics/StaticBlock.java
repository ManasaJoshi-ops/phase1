package basics;

public class StaticBlock {

	public static void main(String[] args) {
		System.out.println("From main method..");
	}
	
	static {
		System.out.println("from static block1");
	}
	static {
		System.out.println("from static block2");
	}
}
