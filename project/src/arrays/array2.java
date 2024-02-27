package arrays;

public class array2 {

	public static void main(String[] args) {
		char c[]= {'a','s','g','k','l'};
//		reverseString();
//		reverseString2();
		
	}


	private static void reverseString2() {
		String s2="helloworld";
		String res="";
		for(char x:s2.toCharArray()) {
			res=x+res;
		}System.out.println(res);
		
	}

	private static void reverseString() {
		String s1="helloworld";
		char c1[]=s1.toCharArray();
		for(int i=c1.length-1;i>=0;i--) {
			System.out.print(c1[i]);
		}
	}
	
}
