package one;

public class demo3 {
	
	public static void main(String args[]) {
		System.out.println("from main method");
		//create instance of class to print the contents and non static block
		
		demo3 obj=new demo3();
	}
	//constructor
	public demo3() {
		System.out.println("from constructor");
	}
	//non static block
	{
		System.out.println("from non static block");
	}

}
