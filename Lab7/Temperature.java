/**
 * Samuel Harkness
 * Converts temperatures
 * In-Lab #7
 * 160 - 07
 * 10-18-05
 */
import java.util.Scanner;

public class Temperature
{
    public static void main( String args[] )
    {
        int one;
        double two;
        String a;
        Scanner in = new Scanner( System.in );
        
        do
        {
            System.out.println( "Enter 1 to convert Fahrenheit to Celsius," );
            System.out.print( "Enter 2 to convert Celsius to Fahrenheit: " );
            one = in.nextInt();
            
            if( one == 1 )
            {
                System.out.print( "Enter temperature in Fahrenheit: " );
                two = in.nextDouble();
                
                two = ( two - 32 ) * 5 / 9;
                
                System.out.println( "In celsius that's " + two );
            }
            else
            {
                System.out.print( "Enter temperature in Celcius: " );
                two = in.nextDouble();
                
                two = two * 9 / 5 + 32;
                
                System.out.println( "In farenheit that's " + two );
            }
            System.out.print( "Would you like to make another conversion? ( y or n ) " );
            a = in.next();
        }
        while( a == "y" );
    }//end main
}//end class