import java.util.Random;
import java.util.Scanner;

public class Four
{
    public static Random random = new Random();
    
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );
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
        String c = "";
        int rand = 1 + random.nextInt( 4 );
        
        if( guess != answer )
            switch( rand )
            {
                case 1: { c = "No. Please try again."; } break;
                case 2: { c = "Wrong. Try once more."; } break;
                case 3: { c = "Don't give up!"; } break;
                case 4: { c = "No. Keep trying."; } break;
            }
        else
            switch( rand )
            {
                case 1: { c = "Very good!\n"; } break;
                case 2: { c = "Excellent!\n"; } break;
                case 3: { c = "Nice work!\n"; } break;
                case 4: { c = "Keep up the good work!\n"; } break;
            }
        
        return c;
    }
}
