package basics;

public class nonstatic {
public static void main(String[] args) {
	
	System.out.println("from main method");
	nonstatic obj=new nonstatic();
}

public nonstatic() {
	System.out.println("from constructor");
}
{
	System.out.println("from non static block");
}

}
