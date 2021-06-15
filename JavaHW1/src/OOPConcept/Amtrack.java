package OOPConcept;

public class Amtrack extends Train {
	private String color;
	private char gender;
	TrainNoise noise;
	
	public Amtrack(String name, String type, boolean car, String food, int wheels, String color, char gender) {
		super(name, type, car, food, wheels);
		this.color = color;
		this.gender = gender;
	}
	
	public void noise(String noisy) {
		noise = new TrainNoise();
		noise.noise = noisy;
	}
	
	public void display() {
		super.display();
		System.out.println("Color: " + this.color);
		System.out.println("Gender ('N' means none): " + this.gender);
		System.out.println("Noise: " + this.noise.noise);
	}
	
	
}