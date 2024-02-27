package arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		int arr[]= {100,90,89,70};
//		printArray(arr);
		arr[0]=20;
//		printArray(arr);
		arr[3]=new Integer(48);
//		printArray(arr);
		
//		System.out.println(arr.length);
//		int x=arr[arr.length];
//		System.out.println(x);
		//exception occurs -->> array index out of bound
		int x=arr[arr.length-1];
//		System.out.println(x);
		
		//{3,5,4,5,6,3,5,7} replace the 5's that follow 3, with a zero
		//{3,0,4,5,6,3,0,7}
		
//		arrayReplace();
//		sumOfArray();
		
		//{3,0,4,5,6,3,0,7}
		//sum of even numbers in the above array
		
		sumOfEvenNumbers();
		
		
	}
	private static void sumOfEvenNumbers() {
		int arr4[]= {3,0,4,5,6,3,0,7};
		int sum=0;
		for(int i:arr4) {
			if((arr4[i])%2==0) {
				sum+=i;
		}
			
		}	System.out.println(sum);
	}
	private static void sumOfArray() {
		int arr3[]= {2,3,5,6,7};
		int sum=0;
		for(int i=0;i<arr3.length;i++) {
			sum+=arr3[i];
		}
		System.out.println(sum);
		
		
	}
	private static void arrayReplace() {
		int arr2[]= {3,5,4,5,6,3,5,7};
		for(int i=0;i<arr2.length-1;i++) {
			if((arr2[i]==5)&& arr2[i-1]==3) {
				System.out.print(arr2[i]=0);
			}else {
				System.out.print(arr2[i]);
			}
		}
	}
	private static void printArray(int array[]) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+",");
		}
		System.out.println();
	}

}
