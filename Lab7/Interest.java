/**
 * Samuel Harkness
 * Converts temperatures
 * In-Lab #7
 * 160 - 07
 * 10-18-05
 */
import java.util.Scanner;

public class Interest
{
    public static void main( String args[] )
    {
        Scanner in = new Scanner( System.in );
        double amt, rate;
        int years, count = 1;
        String a;
        
        do
        {
            System.out.print( "Enter initial amount: " );
            amt = in.nextDouble();
            
            System.out.print( "Enter number of years: " );
            years = in.nextInt();
            
            System.out.print( "Enter interest rate ( percent per year ) : " );
            rate = in.nextDouble();
            
            while( count <= years )
            {
                amt += ( amt * ( rate / 100 ) );
                count++;
            }
            
            System.out.printf( "At the end of %d years, you will have %.2f dollars.\n", years, amt );
            
            System.out.print( "Would you like to do another calculation? ( y or n ) " );
            a = in.next();
        }
        while( a == "y" );
            
    }
}