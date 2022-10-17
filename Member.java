import java.util.*;
public class Member {
	private String name;
	private int age;
	private String address;
	private long phoneNo;
	private int salary;
	
	Scanner sc = new Scanner(System.in);
	
	public void getName(){
		System.out.println("Enter your name:");
		name = sc.nextLine();
	}
	
	public void getAge(){
		System.out.println("Enter your Age:");
		age = sc.nextInt();
	}
	
	public void getAddress(){
		sc.nextLine();
		System.out.println("Enter your address:");
		address = sc.nextLine();
	}
	
	public void getPhoneNo(){
		System.out.println("Enter your phoneNo:");
		phoneNo = sc.nextLong();
	}
	
	public void getSalary(){
		System.out.println("Enter your Salary:");
		salary = sc.nextInt();
	}
	
	public void printName(){
		System.out.println(name);
	}
	
	public void printAge(){
		System.out.println(age);
	}
	
	public void printAddress(){
		System.out.println(address);
	}
	
	public void printPhoneNo(){
		System.out.println(phoneNo);
	}
	
	public void printSalary(){
		System.out.println(salary);
	}
}
	
	
		