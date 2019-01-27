// Fig. 2.7: Addition.java
// Addition program that displays the sum of two numbers.
import javax.swing.JOptionPane;

public class Addition 
{
   // main method begins execution of Java application
   public static void main( String args[] )
   {
      // create Scanner to obtain input from command window
      
      int number1; // first number to add
      int number2; // second number to add
      int sum; // sum of number1 and number2

      String one = JOptionPane.showInputDialog( "Enter first integer; " ); //prompt
      number1 = Integer.parseInt( one ); //stores the string as an integer
      
      String two = JOptionPane.showInputDialog( "Enter second integer; " ); //prompt
      number2 = Integer.parseInt( two ); //stores the string as an integer
      
      sum = number1 + number2; // add numbers
      
      String message = String.format( "The sum is %d", sum );

     JOptionPane.showMessageDialog( null, message ); // display sum

   } // end method main

} // end class Addition