
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
				
		PaidAdvisor p = new PaidAdvisor("John", "Smith");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many hours did " + p.getFirstName() + " " + p.getLastName() + " " + "work?");
		int hours = scan.nextInt();
		p.setHours(hours);
		System.out.println("How many of those hours were special session hours?");
		int specialHours = scan.nextInt();
		System.out.println(p.getFirstName() + " " + p.getLastName() + " earned " + p.toString(specialHours) + " dollars.");
		
	}
}

