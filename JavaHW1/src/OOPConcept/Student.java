package OOPConcept;

public class Student extends Person implements PersonInterface{
	
	int student_id;
	double subject1;
	double subject2;
	double subject3;
	String major;
	float student_totalScore;
	
	Student (int id, String name, int age, char gender, double subject1, double subject2, double subject3, String major, float totalScore)
	{
		super(name,age,gender);
		
		this.student_id = id;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		this.major = major;
		this.student_totalScore = totalScore;
	}
	
	public void display() {
  	super.display();
		System.out.println("id :" + this.student_id);
  	System.out.println("subject1: " + this.subject1 );
  	System.out.println("subject2: " + this.subject2 );
  	System.out.println("subject3: " + this.subject3 );
  	System.out.println("major: " + this.major );
  	System.out.println("totalscore: " + this.student_totalScore );
  }
	
	public double calculate (int student_totalScore) {
		double average = ((this.subject1+this.subject2+this.subject3)/student_totalScore);
		return average;
	}
}
