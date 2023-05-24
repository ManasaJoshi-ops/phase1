package basics;

public class Loops {
	public static void main(String[] args) {
		//for
		
		for(int i=1;i<=3;i++) {
			System.out.println("Hello World");
		}
		
		//1 to 10
		
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		
		//even till 10
		
		for(int i=0;i<=10;i+=2) {
			System.out.println(i);
		}
		System.out.println("---------");
		
		//sum of odd integers
		
		int sum=0;
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}
