package ScannerPackage;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
//		scannerDemo1();
		scannerDemo2();
	}

	private static void scannerDemo2() {
		System.out.println("SCANNER DEMO");
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number(char to exit)");
		while(sc.hasNextInt()) {
			int num=sc.nextInt();
			sum+=num;
			System.out.println("Enter a number(char to exit)");
		}
		System.out.println("sum= "+sum);
		
	}

	private static void scannerDemo1() {
		System.out.println("SCANNER DEMO");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter ID: ");
		int id=sc.nextInt();
		
		System.out.println("Enter Name: ");
		String name=sc.next();
		
		System.out.println("Enter Score: ");
		double score=sc.nextDouble();
		
		System.out.println("Student Details:");
		System.out.println("Student Id: "+id);
		System.out.println("Student Name: "+name);
		System.out.println("Student Score: "+score);
	}

}
