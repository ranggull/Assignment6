
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Person[] staffList = new PaidAdvisor[3];
		staffList[0] = new PaidAdvisor("Sterling", "Archer", 0);
		staffList[1] = new PaidAdvisor("Lana", "Kane", 0);
		staffList[2] = new PaidAdvisor("Cyril", "Figgis", 0);
		
		PaidAdvisor staff = new PaidAdvisor();
		
		staff.payroll();
		
	}
}
