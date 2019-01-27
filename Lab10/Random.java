/**
 * Samuel Harkness
 * Guessing game with a random number
 * In-lab #10
 * 160 - 07
 * 11-8-05 
 */

import java.lang.Math;
import java.util.Scanner;

public class Random
{
    public static void main( String args[] )
    {
        String cont = "y";
        int guess, random;
        Scanner in = new Scanner( System.in );
        
        do
        {
            random = (int)( Math.random() * 1000 );//calculates a random number between 1 and 1000
        
            System.out.print( "I have a number between 1 and 1000.\nCan you guess my number?\nPlease type your first guess: " );
            guess = in.nextInt();        
        
            do
            {
                if( guess < random )
                {
                    System.out.print( "Too low. Try again. " );
                    guess = in.nextInt();
                }
                else if( guess > random )
                {
                    System.out.print( "Too high. Try again. " );
                    guess = in.nextInt();
                }
                else if( guess == random )
                {
                    break;//exits the else if statement, and then the do-while loop
                }
            }while( guess != random );
            
            System.out.print( "Excellent! You guessed the number!\nWould you like to play again (y or n)? " );
            cont = in.next();
        }while( cont.equals( "y" ) );
    }
}