/**
 * Samuel Harkness
 * Calculates pi
 * Out-lab #5
 * 160 - 07
 * 11-1-05
 */
import java.lang.Math;

public class Three
{
    public static void main( String args[] )
    {
        int x;        
        double total;
        
        for( total = 4, x = 3; ( 3.14 - total > .005 ) || ( 3.14 - total < -.005 ); x += 2 )//calculates 3.14
        {
            total += Math.pow( (-1), x / 2 ) * ( 4 / (double)x );            
        }
                
        System.out.println( "Iterations required for 3.14: " + ( x + 1 ) );
        
        for( total = 4, x = 3; ( 3.141 - total > .0005 ) || ( 3.141 - total < -.0005 ); x += 2 )//calculates 3.141
        {
            total += Math.pow( (-1), x / 2 ) * ( 4 / (double)x );            
        }
                
        System.out.println( "Iterations required for 3.141: " + ( x + 1 ) ); 
        
        for( total = 4, x = 3; ( 3.1415 - total > .00005 ) || ( 3.1415 - total < -.00005 ); x += 2 )//calculates 3.1415
        {
            total += Math.pow( (-1), x / 2 ) * ( 4 / (double)x );            
        }
                
        System.out.println( "Iterations required for 3.1415: " + ( x + 1 ) );    
        
        for( total = 4, x = 3; ( 3.14159 - total > .000005 ) || ( 3.14159 - total < -.000005 ); x += 2 )//calculates 3.14159
        {
            total += Math.pow( (-1), x / 2 ) * ( 4 / (double)x );            
        }
                
        System.out.println( "Iterations required for 3.14159: " + ( x + 1 ) );    
        
    }
}