package basics;

public class Opeartor {

	public static void main(String[] args) {
		
		//arithmetic
		
		int a=20, b=10;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		//unary operator
		
		int x=10;
		System.out.println(x++);
		System.out.println(x);
		System.out.println(++x);
		System.out.println(x);
		
		//relational operator
		
		if(a==2) {
			System.out.println(a);
		}
		if(a>b) {
			System.out.println(a);
		}
		if(a<b) {
			System.out.println(b);
		}
		if(a>=2) {
			System.out.println('a');
		}
		if(a<=3) {
			System.out.println(a);	
		}
		
		//logical operator
		
		int a1=200;
		int b1=300;
		if(a1>0|| b1==200) {
			System.out.println("a1 or");
		}
		if(b1<200 && b1==20) {
			System.out.println("eno ondu");
		}
		
		//ternary operator
		
		String s=(a1<b1)?"yes":"no";
		System.out.println(s);
		
		//which is min
		int p=20;
		int q=21;
		int res=(p<q)?p:q;
		System.out.println(res);
		
		//assignment operator +=,-=,*=,/=,%=
		
		int sum=20;
		System.out.println(sum+=2);
		
		
		
		
		
	}
}
