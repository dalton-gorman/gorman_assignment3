package gorman_problem1;

import java.security.SecureRandom;
import java.util.Scanner;


public class CAI1 {
	
	
	public static int askQuestion() {
		
		int num1;
		int num2;
		
		//generate 2 random numbers
		SecureRandom randomizer = new SecureRandom();
		
		num1 = randomizer.nextInt(10);
		num2 = randomizer.nextInt(10);
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
		System.out.println("Very good!");
	}
	
	
	public static void displayIncorrectResponse() {
		System.out.println("No. Please try again.");
	}
	
	
	public static void isAnswerCorrect() {
		
		int answer;
		int response;
		
		//compare response to correct answer. if different, try again
		do {
		
			answer = askQuestion();
			
			do {
				
				response = readResponse();
				
				if (answer == response) {
					
					displayCorrectResponse();
					System.exit(0);
					
				} else {
					
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
