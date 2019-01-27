import java.util.Scanner;
import java.lang.Math;

public class WindChill
{
    public static double Chill( double t, double v )
    {
        double W = 33 - ( 10 * Math.sqrt( v ) - v + 10.5 ) * ( 33 - t ) / 23.1;
        return W;
    }
    
    public static void main( String args[] )
    {
        Scanner in = new Scanner( System.in );
        double v, t;
        String a;
        
        do
        {
            System.out.print( "Enter the temperature ( Must be less than or equal to ten degrees Celsius ): " );
            t = in.nextDouble();
            
            if( t <= 10 )
            {
                System.out.print( "Enter the wind speed: " );
                v = in.nextDouble();
            
                double W = Chill( t, v );
            
                System.out.println( "The wind chill index is " + W );
            }
            else
            {
                System.out.println( "The temperature must be less than or equal to ten degrees Celsius." );
            }
            
            System.out.print( "Would you like to continue? ( y or n ): " );
            a = in.next();
        }while( a.equals( "y" ) );
    }
}