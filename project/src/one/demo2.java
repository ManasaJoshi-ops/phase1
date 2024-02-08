package one;

public class demo2 {

	public static void main(String args[]) {
		System.out.println("From main method");
		method1();
		method2();
		demo2 obj=new demo2();
		obj.method3();
	}
	
	public static void method1() {
		System.out.println("from static method1");
	}
	public static void method2() {
		System.out.println("from static method2");
	}
	public void method3() {
		System.out.println("from non static method");
	}
}
