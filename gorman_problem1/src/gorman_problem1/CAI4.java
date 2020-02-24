package gorman_problem1;

import java.security.SecureRandom;
import java.util.Scanner;


public class CAI4 {	
	
	Scanner input = new Scanner(System.in);
	
	public static int readDifficulty() {
			
		Scanner input = new Scanner(System.in);
			
		System.out.println("\nChoose difficulty level (1-4):");
		int difficulty = input.nextInt();
			
		return difficulty;
	}
	
	
	public static int[] generateQuestionArgument(int level) {
					
			
		int num1;
		int num2;
		int nums[] = new int[2];
		int correctAnswer;
			
		//generate 2 random numbers
		SecureRandom numberRandomizer = new SecureRandom();
				
		//if level 1 random numbers 0-9
		if (level == 1) {
			num1 = numberRandomizer.nextInt(10);
			num2 = numberRandomizer.nextInt(10);
			nums[0] = num1;
			nums[1] = num2;
			return nums;
			
		//if level 2 random numbers 0-99
		} else if (level == 2) {
			num1 = numberRandomizer.nextInt(100);
			num2 = numberRandomizer.nextInt(100);
			nums[0] = num1;
			nums[1] = num2;
			return nums;
			
		//if level 3 random numbers 0-999
		} else if (level == 3) {
			num1 = numberRandomizer.nextInt(1000);
			num2 = numberRandomizer.nextInt(1000);
			nums[0] = num1;
			nums[1] = num2;
			return nums;
			
		//if level 4 random numbers 0-9999
		} else if (level == 4) {
			num1 = numberRandomizer.nextInt(10000);
			num2 = numberRandomizer.nextInt(10000);
			nums[0] = num1;
			nums[1] = num2;
			return nums;
			
		}
				
		return nums;
			
	}
	
	public static int askQuestion(int difficulty) {
		
		//take difficulty input and call the array of two random numbers
		int level = difficulty;
		int nums[] = generateQuestionArgument(level);
		
		//multiply the two array values for the correct answer
		int correctAnswer = nums[0] * nums[1];
		System.out.printf("How much is %d times %d?\n", nums[0], nums[1]);
		
		return correctAnswer;
		
		
		
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
		
		Scanner input = new Scanner(System.in);
		int answer;
		int response;
		double numCorrect = 0.0;
		double question;
		
		
		int difficulty = readDifficulty();
		
		
		
		for (int i=0; i < 10; i++) {
			
			//record how many questions have occurred and print 10 questions
			question = i;
			
			//add one to question because i starts at 0	
			System.out.printf("Question %.0f:\n", question + 1);
			
			answer = askQuestion(difficulty);					
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
		
		//create variable for if student wants to try again y/n
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

