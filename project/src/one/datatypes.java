package one;

public class datatypes {
	static byte a=10;
	public static void main(String[] args) {
		System.out.println(a);
		a=(byte) 150; //type casting
		System.out.println(a);//unpredictable behavior
		System.out.println("Decimal Values");
		float f=1.23f;
		System.out.println(f);
		double d=1.234;
		System.out.println(d);
		//max and min values of datatypes
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
	}

}
