package basics;

public class WrapperClass {

	public static void main(String[] args) {
		
		int i=10;   //primitive 
		Integer i1=new Integer(10);  //object of primitive class-->> wrapper classes
		
		//Boxing-->>automatic conversion of primitive to warpper class
		
		Integer in=5;
		
		//UnBoxing-->> Conversion of wrapper class to primitive
		
		Integer a=new Integer(50);
		
		//automatic Unboxing
		
		Integer y=200;
		if(y>100) {
			System.out.println(y);
		}
		
		
		
	}
}
