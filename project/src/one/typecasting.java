package one;

public class typecasting {
	public static void main(String[] args) {
		byte b=100;
		int a=65;
		//typecasting -->>convert one datatype to another
		
		//implicit -->>automatic
		//small to big
		a=b;
		System.out.println(a);
		//explicit-->> specify explicitly
		//big to small
		b=(byte) a;
		System.out.println(b);
		
		//characters
		
		char ch='a';
		int x=ch;
		System.out.println(ch);
		System.out.println(x);
		
		int y=119;
		char c=(char) y;
		System.out.println(c);
		
		
		
	}

}
