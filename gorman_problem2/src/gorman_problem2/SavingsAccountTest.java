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
	//------------------------------------------------------------
    /*public SavingsAccountTest() {
    
    }
   
    public static void main(String[] args) {
    	
    	//Test program instantiates two SavingsAccount objects
    	SavingsAccount saver1,saver2;
        
    	saver1 = new SavingsAccount (2000.0);
        saver2 = new SavingsAccount (3000.0);
        
        //Test program sets the annualInterestRate to 4%
        SavingsAccount.modifyInterestRate (0.04);
        
       
        //Show 12 months' complete balance
        int totalMonth = 12;  
        
        double[] balanceMonth1 = saver1.getMonthsSavingBalance(totalMonth);  
        //double saver1Month13 = (balanceMonth1[11] + ((balanceMonth1 [11] * .05) / 12));
        double[] balanceMonth2 = saver2.getMonthsSavingBalance(totalMonth); 
        //double saver2Month13 = (balanceMonth2[11] + ((balanceMonth2 [11] * .05) / 12));
        
        System.out.println("Month\tSaver 1\t\tSaver2");
        
        for(int i = 0; i < totalMonth; i++) {
        	
        	System.out.printf("%d\t%.2f\t\t%.2f\n", i+1, balanceMonth1[i], balanceMonth2[i]);
        	
        }
        
        
        	
        /*SavingsAccount.modifyInterestRate(0.05);
        balanceMonth1 = saver1.getMonthsSavingBalance(12);             // I have added This Function that will calculate till which month you want
          for(int i=0; i < totalMonth; i++) {          
              System.out.println("\n Month "+(i+1)+" :\n Saver 1 balance= "+balanceMonth1[i]+" with rate of 0.05" );
         }
         System.out.println("*********************************************************************\n");
          balanceMonth2 = saver2.getMonthsSavingBalance(12);             // I have added This Function that will calculate till which month you want
          for(int i = 0; i < totalMonth; i++)
          {
              System.out.println("\n Month "+(i+1)+" :\n Saver 2 balance= "+balanceMonth2[i]+" with rate of 0.05" );
         }  
         System.out.println("*********************************************************************\n");
      }
    }*/


        
        
        