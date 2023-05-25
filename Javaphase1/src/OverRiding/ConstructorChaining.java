package OverRiding;

public class ConstructorChaining {

	public static void main(String[] args) {
//		ChildClass cc=new ChildClass();
		ChildClass cc=new ChildClass(10);
		
	}
}

class SuperClass{
	SuperClass(){
		System.out.println("no arg superclass");
	}
	int x;
	SuperClass(int x){
		System.out.println("one arg superclass");
	}
}

class ChildClass extends SuperClass{
	ChildClass(){
		this(10);
		System.out.println("no arg childclass");
	}
	
	ChildClass(int y){
		super(y);
		System.out.println("one arg childclass");
	}
}