/**
 * Samuel Harkness
 * Calculates pythagorean triplets
 * Out-lab #5
 * 160 - 07
 * 11-1-05
 */
import java.lang.Math;
import java.util.Scanner;

public class Two
{
    public static void main( String args[] )
    {
        int side1, side2 = 2;
        int hypotenuse = 3;
        
        for( side1 = 1; side1 + side2 + hypotenuse <= 500; side1++ )
        {
            for( side2 = side1; side1 + side2 + hypotenuse <= 500; side2++ )
            {
                if( Math.hypot( side1, side2 ) % 1 == 0.0 )//proves that the pythagorean triplet is an integer
                {
                    hypotenuse = (int)Math.hypot( side1, side2 );
                    System.out.println( side1 + " " + side2 + " " + hypotenuse );
                }
            }
        }
    }
}
