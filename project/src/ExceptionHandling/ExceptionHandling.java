package ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) {
//		divideByZero();
//		stringParserDemo();
		nullPointerExceptionDemo();
	}
	private static void divideByZero() {
		int a, b;
		float c = 0, d = 0;
		System.out.println("Enter two numbers:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("First number entered by user is "+a);
		System.out.println("Second number entered by user is "+b);
		try {
			c=a/b;
			d=a%b;
			System.out.println("The divsion of a and b gives "+c);
			System.out.println("The reminder of a and b gives "+d);
		}catch(Exception ex) {
			System.out.println("Exception occured.."+ex.getMessage());
		}
	}
	
	private static void stringParserDemo() {
		String s="hello";
		try {
			int i=Integer.parseInt(s);
			System.out.println("Converted Integer =" +i);
		}catch(Exception ex) {
			System.out.println("Exception occured .."+ex.getMessage());
		}
	}
	
	private static void nullPointerExceptionDemo() {
		String s=null;
		try {
		System.out.println(s.length());
		}catch(Exception ex) {
			System.out.println("Exception Occured .."+ex.getMessage());
		}
	}
}

