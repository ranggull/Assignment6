
import java.util.Scanner;

public class PaidAdvisor extends Person {

	public PaidAdvisor(String first, String last) {
		super(first, last);

	int hoursWorked = 0;
	private Person[] staffList; 
	staffList = new PaidAdvisor[3];
	staffList[0] = new PaidAdvisor("Sterling", "Archer", hoursWorked);
	staffList[1] = new PaidAdvisor("Lana", "Kane", hoursWorked);
	staffList[2] = new PaidAdvisor("Cyril", "Figgis", hoursWorked);
	}
	
	private payroll() {
		
		int regularPayRate = 25;
		int specialPayRate = 50;
		int overtimePayRate = (int) (regularPayRate * 1.5);
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<staffList.length; i++) {
			
		System.out.println("Enter hours worked for " + staffList[i]);
		hoursWorked[i] = (scan.nextInt());
		
		double payRate = 0;
		double remainder = 0;
		
		if(hoursWorked <= 30) {
			payRate = hoursWorked * regularPayRate;
		}
		else if(hoursWorked > 30) {
			remainder = hoursWorked - 30;
			remainder = remainder * overtimePayRate;
			payRate = 750 + remainder;
		}
		
		String decision = "";
		int special = 0;
		
		System.out.println("Did " + staffList[i] + " work for a special session? (y/n)");
		decision = (scan.nextLine());
		if (decision.equalsIgnoreCase("n")) {
			special = 0;
		}
		else {
			System.out.println("How many special hours did " + staffList[i] + " work?");
			special = (scan.nextInt());
			payRate = (payRate + (special * specialPayRate);
		}
			
		return payRate;
		
		}
	}
}