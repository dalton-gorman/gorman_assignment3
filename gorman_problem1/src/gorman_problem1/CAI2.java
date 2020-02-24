package gorman_problem1;

import java.security.SecureRandom;
import java.util.Scanner;


public class CAI2 {	
	
	
	public static int askQuestion() {
		
		int num1;
		int num2;
		
		//generate 2 random numbers
		SecureRandom numberRandomizer = new SecureRandom();
		
		num1 = numberRandomizer.nextInt(10);
		num2 = numberRandomizer.nextInt(10);
		//ask question on screen
		System.out.printf("How much is %d times %d?\n", num1, num2);
		
		return num1 * num2;
	}
	
	
	public static int readResponse() {
		
		//get response from student
		Scanner input = new Scanner(System.in);
		int response = input.nextInt();
		
		return response;
	}
			
	
	public static void displayCorrectResponse() {
		//randomize responses for correct answer
		
		int i;
		
		SecureRandom correctRandomizer = new SecureRandom();
		
		i = 1 + correctRandomizer.nextInt(4);
		
		switch (i) {
			case 1:
				System.out.println("Very good!");
				break;
			case 2:
				System.out.println("Excellent!");
				break;
			case 3:
				System.out.println("Nice Work!");
				break;
			case 4:
				System.out.println("Keep up the good work!");
				break;
		}
	}
	
	
	public static void displayIncorrectResponse() {
		//randomize responses for incorrect answer
		
		int i;
		
		SecureRandom incorrectRandomizer = new SecureRandom();
		
		i = 1 + incorrectRandomizer.nextInt(4);
		
		switch (i) {
			case 1:
				System.out.println("No. Please try again.");
				break;
			case 2:
				System.out.println("Wrong. Try once more.");
				break;
			case 3:
				System.out.println("Don’t give up!");
				break;
			case 4:
				System.out.println("No. Keep trying.");
				break;
		}
	}
	
	
	public static void isAnswerCorrect() {
		//check if student's response is correct
		int answer;
		int response;
		
		do {
		
			answer = askQuestion();
			
			do {
				
				response = readResponse();
				
				if (answer == response) {
					//print random response for correct answer
					displayCorrectResponse();
					System.exit(0);
					
				} else {
					//print random response for incorrect answer
					displayIncorrectResponse();
				}
			} while (answer != response);
		
		} while (answer != response);
		
	}
	
	
	public static void quiz() {
		isAnswerCorrect();		
	}
	
	
	public static void main(String[] args) {
		quiz();		
	}
}
