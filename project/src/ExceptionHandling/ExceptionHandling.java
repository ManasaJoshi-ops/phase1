package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) {
//		divideByZero();
//		stringParserDemo();
//		nullPointerExceptionDemo();
//		multicatch();
		checkedException();
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
		}finally {
			System.out.println("End of Calculator..");
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
	private static void multicatch() {
		int a,b,c,d;
		System.out.println("Enter two numbers:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		String s="hello";
		String s1=null;
		try {
			//arithmetic Exception
			c=a/b;
			d=a%b;
			System.out.println("The divsion of a and b gives "+c);
			System.out.println("The reminder of a and b gives "+d);
			//Number Format Exception
			int i=Integer.parseInt(s);
			System.out.println("Converted Integer =" +i);
			//null pointer Exception
			System.out.println(s1.length());
			
		}catch(ArithmeticException ae) {
			System.out.println("Arithmetic Exception occured"+ae.getMessage());
		}catch(NumberFormatException nfe) {
			System.out.println("Number Format Exception occured.."+nfe.getMessage());
		}catch(NullPointerException npe) {
			System.out.println("Null Pointer Exception occured"+npe.getMessage());
		}
	}
	private static void checkedException() {
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\manjoshi\\Desktop\\new");
		} catch (FileNotFoundException e) {
			//			e.printStackTrace();
			System.out.println("File Not Found..");
		}
	}
}


