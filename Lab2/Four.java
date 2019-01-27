/**
 * Sam Harkness
 * Seperates a five-digit number into 5 one-digit numbers
 * In-lab #2
 * 160 - 07
 * 9-13-05
 */

import java.util.Scanner; //imports the Scanner utility

public class Four
{
    public static void main( String args[] )
    {
        Scanner input = new Scanner( System.in );
        
        int number1,number2, number3, number4, number5, number6; //initializes variable
        
        System.out.println( "Please enter a five-digit integer: ");
        number1 = input.nextInt(); //read user-input
        
        number2 = number1 / 10000;
        
        number3 = number1 % 10000 / 1000;
        
        number4 = number1 % 10000 % 1000 / 100;  //sets these to the places
        
        number5 = number1 % 10000 % 1000 % 100 / 10;
        
        number6 = number1 % 10000 % 1000 % 100 % 10;
        
        System.out.printf( "%d   %d   %d   %d   %d\n", number2, number3, number4, number5, number6); //displays the seperated number
        
    } //end main method
    
} //end class