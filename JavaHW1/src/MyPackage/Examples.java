package MyPackage;
import java.util.Scanner;
public class Examples{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sentence[] = new String [5];
		System.out.println("Please enter some words: ");
		for (int i = 0; i < sentence.length; i++) 
		{
			sentence[i] = scan.nextLine();
		}
		
		System.out.println("Your array words are: ");
		for (int i=0; i < sentence.length; i++)
		{
			System.out.println(sentence[i]);
		}
		scan.close();

	}
	
	
}






























//package MyPackage;
//import java.util.Scanner;
//public class Examples {
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int num;
//		Scanner scan = new Scanner(System.in);
//		  System.out.println("Enter number: ");
//		  num = scan.nextInt();
//		  for (int i = 0; i < 10; i++) {
//			  System.out.println( num+=2 );
//			  
//		  }
//	}
//}




//package MyPackage;
//import java.util.Scanner;
//public class Examples {
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int num1;
//		int num2;
//		String str;
//		char grade1 ;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a number: ");
//		num1 = scan.nextInt();
//		System.out.println("enter a second number");
//		num2 = scan.nextInt();
//		if (num1 > num2) {
//			System.out.println("num1: "+num1 + " is bigger than " +num2);
//		} else {
//			System.out.println("num1: "+num1+ " is smaller than num2: " + num2 );
//		}
//	}
//}
//


//
//package MyPackage;
//import java.util.Scanner;
//
//public class Examples {
//	
//	public static void main(String[]args) {
//	Scanner myObj = new Scanner(System.in);
//	
//		String word = "Hello World";
//		char charringWord = word.charAt(3);
//		System.out.println(charringWord);
//		
//		String lastName = "Smith";
//		String firstName = "John";
//		String fullName = firstName + " " + firstName;
//		System.out.println(fullName);
//		
//		String sentence = "Those dogs really smell";
//		System.out.println(sentence.startsWith("Those"));
//		System.out.println(sentence.endsWith("dogs"));
//		
//		if(sentence.startsWith("Those")) {
//			System.out.println(sentence.replace("dogs", "cats"));
//		}
//		
//		System.out.println(sentence.charAt(0));
//		System.out.println(sentence.length());
//		System.out.println(sentence.toUpperCase());
//		System.out.println(sentence.toLowerCase());
//		System.out.println(sentence.indexOf("d"));
//		System.out.println(sentence.trim());
//		System.out.println(sentence.concat(" Pets are the best"));
//		System.out.println(sentence.replaceAll("o","a"));
//		//Do blank spaces count? In index?
//		
//		
//	}
//}




















//package MyPackage;
//
//import java.util.Scanner;
//
//public class Hello {
//
//	public static void main(String[] args) {
//	
//		int num;
//		String name = "Name";
//		String str;
//		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("enter a number: ");
//		num=scan.nextInt();
//		
//		System.out println("enter a word: " );
//		str=scan.next();
//		
//		scan.nextLine();
//		
//		System.out.println("Enter your name: ");
//		name=scan.nextLine();
//		
//		System.out.println("The number is: " +num);
//		System.out.println("The name you entered is: ")
//		
//	}
//}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int num=10;
//		char oneChar = 'a';
//		float fnum = 1.1f;
//		double dnum= 1.2;
//		boolean isChosen = true;
//		String word = "noun";
//		
//		
//		
//		
//		System.out.println("Hello World");
//		System.out.println("The word is " + word + ". And " + fnum + " is a float number." );
		
		
		
		


