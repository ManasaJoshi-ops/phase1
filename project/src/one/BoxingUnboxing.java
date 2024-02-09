package one;

public class BoxingUnboxing {
	public static void main(String[] args) {
		//primitive datatypes
		int a=10;
		byte b=20;
		//wrapper types -->> object representation of primitive datatypes
		Integer i=10;
		Byte b1=20;
		
		//Boxing -->> automatic converstion of primitive to wrapper
		
		Integer i1=5;
		
		//Unboxing -->>  conversion of wrapper to primitive
		
		Integer a2=new Integer(6);
		System.out.println(a2);
		
		//auto
		
		Integer y=200;
		if(y>0) {
			System.out.println(y);
		}
		
		
	}

}
