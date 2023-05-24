package basics;

public class StaticMethodsAndNonStaticMethods {

	public static void main(String[] args) {
		System.out.println("from main method");
		method1();
		method2();
		StaticMethodsAndNonStaticMethods obj=new StaticMethodsAndNonStaticMethods();
		obj.method3();
		
		
	}
	
	static void method1() {
		
		System.out.println("from static method1");
	}
	static void method2() {
		System.out.println("from static method2");
	}
	void method3() {
		System.out.println("from non static method3");
	}

}
