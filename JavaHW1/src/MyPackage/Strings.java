package MyPackage;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		
		int[] num1 = new int[] {10,20,30,40,50};
		int num2[] = new int[10];
		char someWords[] = new char[5];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a few single characters ");
		for(int i=0; i < someWords.length; i++)
		{
			someWords[i] = scan.next().toLowerCase().charAt(0);
		}	
		
		System.out.println("The values you enter are: ");
		for(int i=0; i < someWords.length; i++) 
		{
			if(someWords[i] == 'a' || someWords[i] == 'e' || someWords[i] == 'i' || someWords[i] == 'o' || someWords[i] == 'u')
				System.out.println(someWords[i] + " is a vowel");
		} 
		
		else {
				System.out.println(someWords[i] + " is a vowel");
		}
		
	}

}
