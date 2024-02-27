package Serializationdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serializationdemo {
	public static void main(String[] args) {
//		Employee emp=new Employee(1,"Mark",24000.65f,"AA1023");
//		Employee emp2=new Employee(2,"Collins",34508.5f,"AA1024");
//		System.out.println(emp);
//		System.out.println(emp2);
		
		serializationDemo();
		deserializationDemo();
		
	}

	private static void deserializationDemo() {
		try(FileInputStream fis=new FileInputStream("C:\\Users\\manjoshi\\Desktop\\newfile\\emp.scr");
				ObjectInputStream ois=new ObjectInputStream(fis);){
			Employee emp=(Employee) ois.readObject();
			System.out.println("Object DeSerialised "+emp);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	private static void serializationDemo() {
		try(FileOutputStream fos=new FileOutputStream("C:\\Users\\manjoshi\\Desktop\\newfile\\emp.scr");
				ObjectOutputStream oos=new ObjectOutputStream(fos);){
			Employee emp=new Employee(1,"Mark",24000.65f,"AA1023");
			oos.writeObject(emp);
			System.out.println("Object Serialised");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
class Employee implements Serializable{
	int empId;
	String empName;
	Float empSalary;
	transient String empAadhar;
	Employee (int empId, String empName, Float empSalary, String empAadhar){
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;
		this.empAadhar=empAadhar;
	}
//	 public String toString() {
  //  return getClass().getName() + "@" + Integer.toHexString(hashCode());
//	 
	public String toString() {
		return this.empId+"||"+ this.empName+"||"+this.empSalary+"||"+this.empAadhar;
	}
}
