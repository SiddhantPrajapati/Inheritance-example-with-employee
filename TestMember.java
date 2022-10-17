import java.util.*;
public class TestMember {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter choice:\n 1.Manager details\n 2.Employee details");
		int ch = sc.nextInt();
		int no;
		switch(ch) {
			case 1:
				Manager m1 = new Manager();
				m1.getName();
				m1.getAge();
				m1.getPhoneNo();
				m1.getSalary();
				m1.getAddress();
				m1.getDepartment();
				System.out.println("Details of Manager.");
				m1.printName();
				m1.printAge();
				m1.printPhoneNo();
				m1.printSalary();
				m1.printAddress();
				m1.printDepartment();
				break;
			case 2:
				Employee e1 = new Employee();			
				e1.getName();
				e1.getAge();
				e1.getPhoneNo();
				e1.getSalary();
				e1.getAddress();
				e1.getSpecilazation();
				System.out.println("Details of Employee.");
				e1.printName();
				e1.printAge();
				e1.printPhoneNo();
				e1.printSalary();
				e1.printAddress();
				e1.printSpecilazation();
				break;
			default :
				System.out.println("Enter valid choice");
				break;
		}
	}
}
				