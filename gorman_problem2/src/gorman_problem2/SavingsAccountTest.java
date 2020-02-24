package gorman_problem2;

public class SavingsAccountTest {

	public static void main(String[] args) {
		
		//instantiate two savings accounts
		SavingsAccount saver1 = new SavingsAccount(2000.0); 
		SavingsAccount saver2 = new SavingsAccount(3000.0); 
		
		//set annual interest rate to 4%
		SavingsAccount.modifyInterestRate(4.0);
		
		System.out.println("Month\tSaver1\t\tSaver2");
	  
		// Displaying data of two instances for 12 months
		for(int i=1; i<=12; ++i) {
			saver1.calculateMonthlyInterest();
			saver2.calculateMonthlyInterest();
			System.out.print(i + "\t");
			saver1.printMonthlyBalance();
			System.out.print("\t");
			saver2.printMonthlyBalance();
			System.out.println();
		}
		
		System.out.println();
	  
		System.out.println("Next month at 5% Interest");
		System.out.println();
		
		//use modifyInterestRate to change i.r to 5%
		SavingsAccount.modifyInterestRate(5.0);
	  
		//recalculate the instances
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
	  
		//show 13th month
		System.out.print("13\t");
		saver1.printMonthlyBalance();
		System.out.print("\t");
		saver2.printMonthlyBalance();
		System.out.println();
	}
	
}



        
        
        