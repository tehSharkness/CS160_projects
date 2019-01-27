/**
 * Samuel Harkness
 * Converts temperatures
 * In-Lab #7
 * 160 - 07
 * 10-18-05
 */
import java.util.Scanner;
import java.lang.Math;

public class ExtraCredit
{
    public static void main( String args[] )
    {
        Scanner in = new Scanner( System.in );
        double amt, rate, finalamt;
        double years;
        int total;
        String a;
        
        do
        {
            System.out.print( "Enter initial amount: " );
            amt = in.nextDouble();
            
            System.out.print( "Enter final amount: " );
            finalamt = in.nextDouble();
            
            System.out.print( "Enter interest rate ( percent per year ) : " );
            rate = in.nextDouble();
            
            amt = finalamt / amt;
            rate = 1 + rate / 100;
            
            years = Math.log(amt) / Math.log(rate);
            
            if( years % 1 >= 0.5 )
            {
                total = (int)( years ) + 1;                
            }
            else
            {
                total = (int)( years );                
            }
            
            System.out.printf( "It will take %d years to accumulate %.2f dollars.\n", total, finalamt );
            
            System.out.print( "Would you like to do another calculation? ( y or n ) " );
            a = in.next();
        }
        while( a == "y" );
            
    }
}