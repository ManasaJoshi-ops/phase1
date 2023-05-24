package Inheritance;

public class inheritancedemo {

	public static void main(String[] args) {
		JDK8 obj=new JDK8();
		obj.f1();
		obj.f2();
		obj.f3();
		
		
	}
}
	class JDK6{
		JDK6(){
			System.out.println("JDK6 installing..");
		}
		void f1() {
			System.out.println("Inside JDK6");
		}
	}
	
	class JDK7 extends JDK6{
		JDK7(){
			System.out.println("JDK7 installing..");
		}
		void f2() {
			System.out.println("Inside JDK7");
		}
	}
	class JDK8 extends JDK7 {
		JDK8(){
			System.out.println("JDK8 Installing..");
		}
		void f3() {
			System.out.println("Inside JDK8");
		}
	}

