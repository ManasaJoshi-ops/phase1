package basics;

public class nonstaticdemo {
	
	public nonstaticdemo() {
		System.out.println("from constructor");
	}
	static {
		System.out.println("from static block");
	}
	{
		System.out.println("from non static block");
	}
	
	public static void main(String[] args) {
		System.out.println("from main method");
		nonstaticdemo obj=new nonstaticdemo();
		nonstaticdemo obj2=new nonstaticdemo();
	}

}
