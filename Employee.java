import java.util.*;
public class Employee extends Member {
	private String specilazation;
	
	Scanner sc = new Scanner(System.in);
	
	public void getSpecilazation() {
		sc.nextLine();
		System.out.println("Enter the specilazation");
		specilazation = sc.nextLine();
	}
	
	public void printSpecilazation() {
		System.out.println(specilazation);
	}
}