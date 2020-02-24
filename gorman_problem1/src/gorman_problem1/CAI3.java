package gorman_problem1;

import java.security.SecureRandom;
import java.util.Scanner;


public class CAI3 {	
	
	Scanner input = new Scanner(System.in);
	
	
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
				System.out.println("Very good!\n");
				break;
			case 2:
				System.out.println("Excellent!\n");
				break;
			case 3:
				System.out.println("Nice Work!\n");
				break;
			case 4:
				System.out.println("Keep up the good work!\n");
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
				System.out.println("No. Please try again.\n");
				break;
			case 2:
				System.out.println("Wrong. Try once more.\n");
				break;
			case 3:
				System.out.println("Don�t give up!\n");
				break;
			case 4:
				System.out.println("No. Keep trying.\n");
				break;
		}
	}
	
	
	public static void displayCompletionMessage(double numCorrect, double question) {
		
		//take amount of questions and number of correct answers to find percentage
		double percent = ((numCorrect / (question + 1)) * 100);
		double numIncorrect = 10 - numCorrect;
		
		System.out.printf("Correct Answers: %.0f\nIncorrect Answers: %.0f\n", numCorrect, numIncorrect);
		System.out.printf("Percentage Correct: %.0f%%\n\n", percent);
		
		//if percent is better than 75, they mastered it and if not then they are urged to try again
		if (percent <= 75) {
			System.out.println("Please ask your teacher for extra help.\n");
		} else {
			System.out.println("Congratulations, you are ready to go to the next level!\n");
		}
		
	}
	
	
	public static void isAnswerCorrect() {
		
		int answer;
		int response;
		double numCorrect = 0.0;
		double question;
		
		for (int i=0; i < 10; i++) {
			
			//record how many questions have occurred and print 10 questions
			question = i;
			
			//add one to question because i starts at 0	
			System.out.printf("Question %.0f:\n", question + 1);
			
			answer = askQuestion();					
			response = readResponse();
					
			if (answer == response) {
					
				numCorrect++;
				displayCorrectResponse();
								
			} else {
				displayIncorrectResponse();

			}
			
			//when 10 questions are asked, determine pass/fail
			if (i == 9) {
				displayCompletionMessage(numCorrect, question);
			}
		
		}		
	}
	
	
	public static void quiz() {
		
		Scanner input = new Scanner(System.in);
		String yn;
				
		do {
			isAnswerCorrect();
			System.out.println("Would you like to solve a new problem set? (y/n)\n");
			yn = input.next();
		}while (yn.equalsIgnoreCase("y"));
		System.out.printf("\n\n\n");
		
		
	}
	
	
	public static void main(String[] args) {
		quiz();		
	}
}
