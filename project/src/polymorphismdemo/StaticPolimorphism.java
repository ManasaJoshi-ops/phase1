package polymorphismdemo;

public class StaticPolimorphism {

	public static void main(String[] args) {
		//method overloading
		CompileTime ctp=new CompileTime();
		ctp.add(1, 3);
		ctp.add(6.66f, 0.98f);
		ctp.add('a', 'b');
		ctp.add(2, 3, 7);
	}
}
class CompileTime{
	void add(int a, int b) {
		int result=a+b;
		System.out.println("The addition of two integers is "+result);
	}
	void add(int a, int b, int c) {
		int result=a+b+c;
		System.out.println("The addition of three integers is "+result);
	}
	void add(float a, float b) {
		float result=a+b;
		System.out.println("The addition of two non-integers is "+result);
	}
	void add(String a, String b) {
		String result=a+b;
		System.out.println("The addition of two Strings is "+result);
	}
}
