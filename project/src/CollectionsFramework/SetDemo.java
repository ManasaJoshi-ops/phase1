package CollectionsFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		//duplicates not allowed
		//implements hashset
//		randomdemo();
		setdemo();
	}

	
	private static void randomdemo() {
	
		Random random=new Random();
		int x=random.nextInt();
		System.out.println(x);
		int x1=random.nextInt(100);
		System.out.println(x1);
		int x2=random.nextInt(1,10);
		System.out.println(x2);
	}
	private static void setdemo() {
		Random random=new Random();
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<=10;i++) {
			list.add(random.nextInt(1,10));
		}System.out.println(list);
		
		Set<Integer> set=new HashSet<>(list);
		System.out.println(set);
		//removes duplicates
		
		Set<Integer> set1=new LinkedHashSet<>(list);
		System.out.println(set1);
		//ascending
		
		Set<Integer> set2=new TreeSet<>(list);
		System.out.println(set2);
	}

}
