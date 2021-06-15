package OOPConcept;

public class Employee extends Person implements PersonInterface {

	int emp_id;
	double emp_salary;
	static int count = 0;
	Address address; 
	
	Employee(int id, String name, int age, char gender, double salary) {
		super(name, age, gender);
		this.emp_id = id;
		this.emp_salary = salary;
		
		count = super.count;
	}
	
	
	public void display() {
		System.out.println("Organization: " + PersonInterface.ORGINIZATION);
		System.out.println("ID : " + this.emp_id);
		super.display(); 
		System.out.println("Salary: " + this.emp_salary);
		System.out.println("City: " + address.city);
		System.out.println("State: " + address.state);
		System.out.println("Zipcode: " + address.zipcode);
		System.out.println("Street: " + address.street);
		
	}
	
	public void createAddr(String city, String state, String street, int zipcode){
		address = new Address();
		address.city = city;
		address.state = state;
		address.zipcode = zipcode;
		address.street = street;
	}
	
	public static void totalPerson() {
		System.out.println("number of emp " + count);
		System.out.println("------------------------------------------");
	}
	
	public void task(String task1, String task2) {
		String[] tasks = {task1, task2};
		for(int n = 1; n <= 2; n++) {
			
			System.out.println("Job " + n + ": " + tasks[n - 1]);
		}
	}
	
	
	public double calculate(int bonus) {
		double netSalary = bonus + this.emp_salary;
		return netSalary;
	}

}

