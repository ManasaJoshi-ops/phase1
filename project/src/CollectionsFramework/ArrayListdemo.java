package CollectionsFramework;

import java.util.ArrayList;

public class ArrayListdemo {
	public static void main(String[] args) {
		//when more read operations
		//default capacity=10
		//stores values in arrays
		//when arraylist capacity full-->> new array list is created and the contents are copied to it (the new element is then added)
//		demo1();
//		demo2();
//		demo3();
		
		demo4ex();
	}

	private static void demo4ex() {
		//set value of position 3 to 101
		ArrayList <Integer> intlist=new ArrayList<Integer>();
		for(int i=0;i<=100;i+=10) {
			intlist.add(i);
		}
		System.out.println(intlist);
		intlist.set(3, 101);
		System.out.println(intlist);
		//remove value
		intlist.remove(2);
		System.out.println(intlist);
		//search for a value
		int value=101;
		if(intlist.contains(value)) {
			System.out.println(intlist);
		}
	}

	private static void demo3() {
		ArrayList <Integer> intlist=new ArrayList<Integer>();
		for(int i=0;i<=100;i+=10) {
			intlist.add(i);
		}
		System.out.println(intlist);
		intlist.add(3, 300);
		System.out.println(intlist);
		
		
	}

	private static void demo2() {
		ArrayList <String> newlist=new ArrayList <String>();
		newlist.add("a");
		newlist.add("hello");
		newlist.add("10");
		newlist.add("##");
		System.out.println(newlist);
		
		
	}

	private static void demo1() {
		ArrayList list=new ArrayList();
		list.add(10);
		list.add("hello");
		list.add("s");
		list.add(22.5);
		System.out.println(list);
		
	}

}
