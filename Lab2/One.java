/**
 * Sam Harkness
 * Adds, divides, multiplies, and subtracts user-input integers
 * In-lab #2
 * 160 - 07
 * 9-13-05
 */


import java.util.Scanner; //program uses class Scanner

public class One
{
    //main method
    public static void main( String args[] )
    {
            //create Scanner for user input
            Scanner input = new Scanner( System.in );
            
            //initializes the variables
            int number1, number2, sum, difference, product, quotient;
            
            System.out.print( "Enter first integer: " ); //prompt
            number1 = input.nextInt(); //read first number from user
            
            System.out.print( "Enter second integer: " ); //prompt
            number2 = input.nextInt(); //read second number from user
            
            sum = number1 + number2; //add numbers
            
            difference = number1 - number2; //subtract numbers
            
            product = number1 * number2; //multiply numbers
            
            quotient = number1 / number2; //divide numbers
            
            System.out.printf( "The sum of %d and %d is %d\n", number1, number2, sum ); //display sum
            
            System.out.printf( "The difference of %d and %d is %d\n", number1, number2, difference ); //display difference
            
            System.out.printf( "The product of %d and %d is %d\n", number1, number2, product ); //display product
            
            System.out.printf( "The quotient of %d and %d is %d\n", number1, number2, quotient ); //display quotient
           
        } //end main method
        
    } // end class