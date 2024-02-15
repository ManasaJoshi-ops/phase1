package inheritance;

public class methodOverriding {
	public static void main(String[] args) {
		car car=new car(1,2,3,4);
		car.fuel();
	}

}

class vehicle{
	int a, b;
	vehicle(int a, int b){
		this.a=a;
		this.b=b;
	}
	void fuel() {
		System.out.println("Petrol");
	}
	
}

class car extends vehicle{
	int c, d;
	car(int a, int b,int c, int d) {
		super(a,b);
		this.c=c;
		this.d=d;
	}

	void fuel() {
		super.fuel();//parent
		System.out.println("Diesel");//overriden
		
	}
	
}
//class bike extends vehicle{
//	
//}
//class bus extends vehicle{
//	
//}