// Fig. 3.13: Account.java
// Account class with a constructor to 
// initialize instance variable balance.

public class Account
{   
   private double balance; // instance variable that stores the balance

   // constructor  
   public Account( double initialBalance )
   {
      // validate that initialBalance is greater than 0.0; 
      // if it is not, balance is initialized to the default value 0.0
      if ( initialBalance > 0.0 ) 
         balance = initialBalance; 
   } // end Account constructor

   // credit (add) an amount to the account
   public void credit( double amount )
   {      
      balance = balance + amount; // add amount to balance 
   } // end method credit

   // return the account balance
   public double getBalance()
   {
      return balance; // gives the value of balance to the calling method
   } // end method getBalance
   
   public void debit( double withdraw ) //mutator that changes balance
   {
       if( withdraw < balance )
       {
           balance = balance - withdraw; //withdraws the amount entered if it is less than the total balance
       }
       else
       {
           System.out.println( "Debit amount exceeded account balance" ); //messaged displayed if the debit is greater than the account balance
       }
   } //end method debit
   
} // end class Account

