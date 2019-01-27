import java.util.Scanner;
import java.util.Random;

public class Three
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );
        Random random = new Random();
        int guess, answer, one, two;
        String a = "y";
        
        do
        {
            one = 1 + random.nextInt( 10 );
            two = 1 + random.nextInt( 10 );
            answer = one * two;
            
            System.out.print( question( one, two ) );
            guess = input.nextInt();
            
            do
            {
                System.out.print( output( answer, guess ) );
                if( guess != answer )
                    guess = input.nextInt();
                
            }while( guess != answer );
                
            System.out.print( output( answer, guess ) + "Would you like to continue? (y or n): " );
            a = input.next();
        }while( a.equals( "y" ) );
    }
    
    public static String question( int one, int two )
    {
        String b;
        
        b = "How much is " + one + " times " + two + "? ";
        return b;
    }
    
    public static String output( int answer, int guess )
    {
        String c;
        
        if( guess != answer )
        {
            c = "No. Please try again. ";
        }
        else
            c = "Very good!\n";
        
        return c;
    }
}
