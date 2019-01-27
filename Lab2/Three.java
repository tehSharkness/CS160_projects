/**
 * Sam Harkness
 * Determines if a user-input integer is odd or even
 * In-lab #2
 * 160 - 07
 * 9-13-05
 */

import java.util.Scanner; //import Scanner utility
public class Three
{
    public static void main( String args[] )
    {
        // create Scanner for user input
        Scanner input = new Scanner( System.in );
        
        int number1, result; //initializes variables
        
        System.out.print( "Enter integer: "); //prompt
        number1 = input.nextInt(); // read number from user
        
        result = number1 % 2; // gets the remainder of number1
        
        if (result == 0)
           { System.out.println( "Integer is even." );
            }
        else
        {    System.out.println( "Integer is odd." );
        }
        
        }//ends main method
        
    }//ends class