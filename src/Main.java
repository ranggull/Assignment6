
import java.util.Scanner;


public class Main {

	int hoursWorked = 0;
	private Person[] staffList; 
	staffList = new PaidAdvisor[3];
	
	public static void main(String[] args) {
		
		staffList[0] = new PaidAdvisor("Sterling", "Archer", hoursWorked);
		staffList[1] = new PaidAdvisor("Lana", "Kane", hoursWorked);
		staffList[2] = new PaidAdvisor("Cyril", "Figgis", hoursWorked);
		
		PaidAdvisor staff = new PaidAdvisor();
		
		staff.payroll();
		
	}
}
