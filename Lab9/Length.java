import java.util.Scanner;

public class Length
{
    public static double conversion( double feet, double inches )
    {
        feet = feet + ( inches / 12 );
        double meters = feet * .3048;
        return meters;
    }
    
    public static void main( String args[] )
    {
        Scanner in = new Scanner( System.in );
        double feet, inches, meters;
        
        do
        {
            System.out.print( "Enter the feet ( 0 to exit ): " );
            feet = in.nextDouble();
            
            if( feet > 0 )
            {
                System.out.print( "Enter the inches: " );
                inches = in.nextDouble();
                
                meters = conversion( feet, inches );
                
                System.out.println( "The equivalent in meters is " + meters );                
            }
            else if( feet < 0 )
            {
                System.out.println( "Please enter a positive number." );
            }
        }while( feet != 0 );
    }
}