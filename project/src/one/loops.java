package one;

public class loops {
	public static void main(String[] args) {
		//loops--used for iteration
//		System.out.println("Happy Birthday");
//		System.out.println("Happy Birthday");
//		System.out.println("Happy Birthday");
		for(int i=1;i<=3;i++) {
			System.out.println("Happy Birthday");
		}
		
		//print even numbers from 1 to 10
		
		for(int i=0;i<=10;i+=2) {
			System.out.println(i);
		}
		
		//OR
		for(int i=0;i<=10;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		//sum of odd numbers from one to ten
		System.out.print("sum of odd numbers from 1 to 10 is ");
		int sum=0;
		for(int i=0;i<=10;i++) {
			if(i%2!=0) {
				sum+=i;
			}
		}
		System.out.println(sum);
		
		//print numbers from 10 to 1
		
		for(int i=10;i>=1;i--) {
			System.out.println(i);
		}
		
		//break and continue
		System.out.println("-----------------------------");
		for(int i=0;i<=10;i++) {
			System.out.println(i);
			if(i==5) {
				break;
			}else {
				continue;
			}
		}
		
		//while loop
		System.out.println("-----------------------------");
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i+=1;
		}
	}

}
