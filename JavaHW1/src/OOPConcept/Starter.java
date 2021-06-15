package OOPConcept;
import java.util.Scanner;

public class Starter {

	public static void main(String[] args) {
		
		int id, age, bonus, zipcode;
		float sub1, sub2, sub3, salary;
		char gender;
		String name, major, task1, task2, city, street, state;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the employee's name : ");
		name = scan.nextLine();
		
		System.out.println("Enter the employee's id number: ");
		id = scan.nextInt();
		
		System.out.println("Enter the employee's age: ");
		age = scan.nextInt();
		
		System.out.println("Enter the employee's gender: ");
		gender = scan.next().charAt(0);
		
		System.out.println("Enter the employee's salary: ");
		salary = scan.nextFloat();
		
		System.out.println("Enter the employee's bonus amount: ");
		bonus = scan.nextInt();
		
		System.out.println("Enter the employee's job during 1st shift: ");
		scan.nextLine();
		task1 = scan.nextLine();
		
		System.out.println("Enter the employee's job during 2nd shift:  ");
		task2 = scan.nextLine();
		
		System.out.println("Enter city that the employee lives in: ");
		city = scan.nextLine();
		
		System.out.println("Enter employee's resident state: ");
		state = scan.nextLine();
		
		System.out.println("Enter employee's street : ");
		street = scan.nextLine();
		
		System.out.println("Enter employee's zipcode: ");
		zipcode = scan.nextInt();
		
		Employee emp1 = new Employee(id, name, age, gender, salary);
		
		
		emp1.createAddr(city, state, street, zipcode);
		emp1.display();
		
		System.out.println("This is the employee's net salary with bonus included:  "+emp1.calculate(bonus));
		emp1.task(task1, task2);
		Employee.totalPerson();
		
		System.out.println("Enter the student's name: ");
		scan.nextLine();
		name = scan.nextLine();
		
		System.out.println("Enter the student's id: ");
		id = scan.nextInt();
		
		System.out.println("Enter the student's age: ");
		age = scan.nextInt();
		
		System.out.println("Enter student's first class of the day: ");
		scan.nextLine();
		task1 = scan.nextLine();
		
		System.out.println("Enter student's second class of the day: ");
		scan.nextLine();
		task2 = scan.nextLine();
		
		System.out.println("Enter a grade for the student for one subject: ");
		sub1 = scan.nextFloat();
		
		System.out.println("Enter a grade for the student for a second subject: ");
		sub2 = scan.nextFloat();
		
		System.out.println("Enter a grade for the student for a third subject: ");
		sub3 = scan.nextFloat();
		
		System.out.println("Enter the student's Gender: ");
		gender = scan.next().charAt(0);
		
		System.out.println("Enter the student's Major: ");
		scan.nextLine();
		major = scan.nextLine();

		System.out.println("Enter the student's city: ");
		city = scan.nextLine();
		
		System.out.println("Enter the student's state: ");
		state = scan.nextLine();
		
		System.out.println("Enter the student's street:");
		street = scan.nextLine();
		
		System.out.println("Enter the student's zipcode: ");
		zipcode = scan.nextInt();
		
		Student student1 = new Student(id, name, age, gender, major, sub1, sub2, sub3);
		student1.createAddr(city, state, street, zipcode);
		student1.display();
		double avg = student1.calculate(3);
		System.out.println("Total Score: " + String.format("%.3f", avg));
		student1.task(task1, task2);;
				
		Amtrack train1 = new Amtrack("Train", "Amtrak", true, "Gas", 48, "Silver", 'N');
		train1.noise("Choo Choo");
		train1.display();
	
	}

}

