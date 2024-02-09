package one;

public class operators {
	public static void main(String[] args) {
		int a=10;
		int b=5;
		System.out.println("Arithmetic operators");
		int result=a+b;
		System.out.println(result);
	    result=a-b;
	    System.out.println(result);
	    result=a*b;
	    System.out.println(result);
		result=a/b;
		System.out.println(result);
		result=a%b;
		System.out.println(result);
		
		//unary operators
		System.out.println("Unary operators");
		System.out.println(a);
		System.out.println(a++);//printed before increment
		System.out.println(a);
		System.out.println(++a);//first incremented and then printed
		System.out.println(a);
		System.out.println(a--);
		System.out.println(a);
		System.out.println(--a);
		System.out.println(a);
		
		//boolean
		System.out.println("boolean unary");
		boolean isSelected=false;
		if(!isSelected) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		//relational operators --  >,<,!=
		//logical operators --  &&, ||
		
		int age=14;
		boolean drivingClassAttended=false;
		if(age>15 && drivingClassAttended) {
			System.out.println("Liscence issued");
		}
		else {
			System.out.println("Come again later");
		}
		
		boolean isAccountActive=false;
		int balance=500;
		if(balance>1000 || isAccountActive) {
			System.out.println("Transaction approved..");
		}else {
			System.out.println("Transaction rejected..");
		}
		
		//ternary operator
		String liscence =(age>15 &&drivingClassAttended)?"Liscence Issued":"Come later";
		System.out.println(liscence);
		
		//min of two numbers using ternary operator
		
		int p=10;
		int q=2;
		int min_value=(p>q)?q:p;
		System.out.println(min_value);
		
		//assignment operator--(+=,-=,*=,/=)`
		int wp=10;
		p+=1;
		System.out.println(p);
		
		
	}

}
