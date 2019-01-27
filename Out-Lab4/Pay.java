/**
 * Samuel Harkness
 * Calculates the gross pay for an indefinite number of employees
 * Out-Lab #4
 * 160 - 07
 * 10-11-05 
 */
import java.util.Scanner;

public class Pay
{
    public static void main( String args[] )
    {
        Scanner input = new Scanner( System.in ); 
        double hours, pay;
        
        System.out.println( "This program will calculate the gross pay for each employee.  To end this program enter a value of 0 or less for the hours." );
        do
        {
            System.out.print( "Please enter the hours for the employee: " );
            hours = input.nextDouble();
            
            if( hours > 0 )//terminates the loop if the sentinel value is entered
            {
                System.out.print( "Please enter the pay rate for the employee: ");
                pay = input.nextDouble();
                
                double wages = gross( hours, pay );
                
                System.out.printf( "The gross pay of the employee is %.2f\n", wages );
            }
        } while( hours > 0 );
        
        System.out.println( "Program ended." );
        
    }//end main method
    
    public static double gross( double x, double y )
    {
        double hrs = x;
        double py = y;
        double grs;
        
        if( hrs < 40 )
        { 
            grs = hrs * py;
        }
        else
        {
            grs = ( 40 * py ) + ( ( hrs - 40 ) * 1.5 * py );
        }
        
        return grs;
            
    }//end gross method
}//end class