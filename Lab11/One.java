/**
 * Samuel Harkness
 * Adds olde-English money together
 * In-Lab#11
 * 160 - 07
 * 11-15-05
 */

import java.util.Scanner;

public class One
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner( System.in );
        String cont = "y", one, two;
                
        do
        {
            System.out.print( "Enter first amount: " );
            one = in.next() + " " + in.next() + " " + in.next();//reads the entire line to a string
        
            System.out.print( "Enter second amount: " );
            two = in.next() + " " + in.next() + " " + in.next();
        
            money( one, two );//calls the method
            System.out.print( "Do you wish to continue? (y/n) ? " );
            cont = in.next();
        }while( cont.equals( "y" ) );
    }
    
    public static void money( String one, String two )
    {
        Scanner s = new Scanner( one );//establishes a scanner based solely on the string
        int pounds = s.nextInt();//reads the ints of the strings, skipping over whitespace
        int shillings = s.nextInt();
        int pence = s.nextInt();
        
        Scanner t = new Scanner( two );
        pounds += t.nextInt();
        shillings += t.nextInt();
        pence += t.nextInt();
        
        while( pence >= 12 )//calculates pence
        {
            shillings += 1;
            pence -= 12;
        }
        while( shillings >= 20 )//calculates shillings
        {
            pounds += 1;
            shillings -= 20;
        }
        
        System.out.println( "Total is: " + pounds + " " + shillings + " " + pence );        
    }
}