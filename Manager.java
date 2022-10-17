import java.util.*;
public class Manager extends Member {
	private String department;
	Scanner sc = new Scanner(System.in);
	
	public void getDepartment() {
		sc.nextLine();
		System.out.println("Enter the department");
		department = sc.nextLine();
	}
	
	public void printDepartment() {
		System.out.println(department);
	}
}