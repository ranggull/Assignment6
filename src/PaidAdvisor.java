
import java.util.Scanner;

public class PaidAdvisor extends Person {

	private int hoursWorked;
	private int regularPayRate;
	private int specialPayRate;
	private double overtimePayRate;
	
	public PaidAdvisor(String first, String last) {
		super(first, last);
		hoursWorked = 0; 
		regularPayRate = 25; 
		specialPayRate = 50; 
		overtimePayRate = regularPayRate * 1.5;

	}
	
	public PaidAdvisor(String first, String last, int hoursWorked) {
		super(first, last); 
		this.hoursWorked = hoursWorked;

	}
	
	public int getPayRate() {
		return regularPayRate;
	}

	public String toString(int hours) {
		return "" + calculatePay(hours);
	}
	
	public void setHours(int hours) {
		hoursWorked = hours;
	}
	
	private double calculatePay(int hours) {
		
		double payCheck = 0;
		int regularHours = 0;
		int overtimeHours = 0;
		int specialHours = hours;
		
		hoursWorked = hoursWorked - specialHours;
		
		if(hoursWorked > 30) {
			regularHours = 30;
			overtimeHours = hoursWorked - 30;
		}
		
		else {
			regularHours = hoursWorked;
		}
		
		payCheck = ((specialHours * specialPayRate) + (regularHours * regularPayRate) + (overtimeHours * (overtimePayRate)));
		
		return payCheck;
	}
}
