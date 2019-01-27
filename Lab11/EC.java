/**
 * Samuel Harkness
 * Adds olde-English money together
 * In-Lab#11
 * 160 - 07
 * 11-15-05
 */

import java.util.Scanner;

public class EC
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner( System.in );
        String cont = "y", one, two;
                
        do
        {
            System.out.print( "Enter first amount: " );
            one = in.next();//reads the entire line to a string
        
            System.out.print( "Enter second amount: " );
            two = in.next();
        
            money( one, two );//calls the method
            System.out.print( "Do you wish to continue? (y/n) ? " );
            cont = in.next();
        }while( cont.equals( "y" ) );
    }
    
    public static void money( String one, String two )
    {
        one = one.replace( ".", " " );
        two = two.replace( ".", " " );
        
        Scanner s = new Scanner( one );//establishes a scanner using the string
        int pounds = s.nextInt();
        int shillings = s.nextInt();
        int pence = s.nextInt();
        
        Scanner t = new Scanner( two );
        pounds += t.nextInt();
        shillings += t.nextInt();
        pence += t.nextInt();
        
        while( pence >= 12 )
        {
            shillings += 1;
            pence -= 12;
        }
        while( shillings >= 20 )
        {
            pounds += 1;
            shillings -= 20;
        }
        
        System.out.println( "Total is: " + pounds + "." + shillings + "." + pence );        
    }
}