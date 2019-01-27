import java.util.Scanner;
import java.lang.Math;

public class One
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner( System.in );
        
        System.out.print( "How many iterations? " );
        int number = in.nextInt();
        System.out.println( perfect( number ) );
    }
    
    public static String perfect( int number )
    {
        int num1, num2, num3, num4, total = 0;
        String out = "";
        
        for( num1 = 2; num1 <= number; num1++)//prime number set
        {
            for( num2 = 2; num2 < num1; num2++ )//prime number test
            {
                if( ( num1 % num2 == 0 ) && ( num1 != 2 ) )
                    break;
                else
                {
                    num3 = (int)Math.pow( 2, num1 ) - 1;//Mersenne Primes
                    
                    for( num4 = 1; num4 <= num3; num4++ )//perfect numbers
                        total += num4;
                }                
            }
            
            if( total > 0 )
                out += total + "\t";
        }
        
        return out;       
    }
}
