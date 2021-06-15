package OOPConcept;

public class Train {
	private String name;
	private boolean speed;
	private String eats;
	private int numOfWheels;
	private String type;
	
	public Train (String name, String type, boolean car, String gas, int wheels){
		this.name = name;
		this.speed = car;
		this.eats = gas;
		this.numOfWheels = wheels;
		this.type = type;
	}
	
	public void display() {
		System.out.println("------------------------------------------");
		System.out.println("Trains");
		System.out.println("------------------------------------------");
		System.out.println("This object is a: " + this.name);
		System.out.println("This brand of train is: " + this.type);
		System.out.println("Is fast: " + this.speed);
		System.out.println("Eats: " + this.eats);
		System.out.println("Number of wheels: " + this.numOfWheels);
	}
}
