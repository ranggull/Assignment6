
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
				
		Person p = new Person(Sterling, Archer);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many hours did " + p.getFirstName() + p.getLastName() + "work?");
		int hours = 0;
		hours = scan.nextInt();
		p.setHours(hours);
		System.out.println("How many of those hours were special hours?");
		int specialHours = 0;
		specialHours = scan.nextInt();
		System.out.println(p.getFirstName() + p.getLastName() + " earned " + p.toString(payCheck) + " dollars.");
		
		
	}
}

