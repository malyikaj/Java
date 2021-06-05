package MyPackage;

import java.util.Scanner;

public class Calculator {

	public static int add() {
		Scanner input = new Scanner (System.in);
		System.out.print("Add two numbers... ");
		System.out.print("First number: ");
		int firstNum = input.nextInt();
		System.out.println("Second number: ");
		int secondNum = input.nextInt();
		return firstNum + secondNum;
	}
	
	public static int subtract() {
		Scanner input = new Scanner (System.in);
		System.out.print("Subtract two numbers... ");
		System.out.print("First number: ");
		int firstNum = input.nextInt();
		System.out.println("Second number: ");
		int secondNum = input.nextInt();
		return firstNum - secondNum;
	}
	
	public static int multiply() {
		Scanner input = new Scanner (System.in);
		System.out.print("Multiply two numbers... ");
		System.out.print("First number: ");
		int firstNum = input.nextInt();
		System.out.println("Second number: ");
		int secondNum = input.nextInt();
		return firstNum * secondNum;
	}
	
	public static float division() {
		Scanner input = new Scanner (System.in);
		System.out.println("Divide two numbers... ");
		System.out.print("First number: ");
		float firstNum = input.nextFloat();
		System.out.println("Second number: ");
		float secondNum = input.nextFloat();
		return firstNum/secondNum;
	}
	
	public static void main(String [] args) {
		int a = 1;
		
		while (a==1) {
			Scanner input = new Scanner (System.in);
			System.out.println("Please enter a choice: ");
			System.out.println("1. Add");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Exit");
			System.out.println("Enter your choice: ");
			
			int choice = input.nextInt();
			
			switch(choice) {
			case 1: 
				System.out.print(add());
				break;
			case 2:
				System.out.print(subtract());
				break;
			case 3:
				System.out.print(multiply());
				break;
			case 4:
				System.out.print(division());
				break;
			case 5:
				a += 1;
				break;
			default:
				System.out.print("Please pick a number 1-5");
			
			}
			
		}
		
	}
		
}


