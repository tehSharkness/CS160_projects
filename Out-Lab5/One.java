/**
 * Samuel Harkness
 * Calculates invoice using switch
 * Out-lab #5
 * 160 - 07
 * 11-1-05
 */
import java.util.Scanner;

public class One
{
    public static double costPerItem( int pNum, int quantity )
    {
        double total = 0;
        switch( pNum )
        {
            case 1: { total = 2.98 * quantity; } break;
            case 2: { total = 4.5 * quantity; } break;
            case 3: { total = 9.98 * quantity; } break;
            case 4: { total = 4.49 * quantity; } break;
            case 5: { total = 6.87 * quantity; } break;
            default: break;
        }
        return total;
    }
    
    public static void main( String args[] )
    {
        Scanner in = new Scanner( System.in );
        int pNum = 1, quantity;
        double total = 0.0;
        
        System.out.println( "Enter 0 for the product number to exit." );
        System.out.print( "Product 1: $2.98. \nProduct 2: $4.50. \nProduct 3: $9.98. \nProduct 4: $4.49. \nProduct 5: $6.87. \n" );//list of products and prices
        while( pNum > 0 )
        {
            System.out.print( "Please enter the product number: ");
            pNum = in.nextInt();
            
            if( ( pNum >= 1 ) && ( pNum <= 5 ) )//error prevention
            {
                System.out.print( "Please enter the quantity: ");
                quantity = in.nextInt();
            
                total += costPerItem( pNum, quantity );
            }
            else
            {
                System.out.println( "Enter a correct product number." );//warning
            }
        }
        
        System.out.println( "Your total is $" + total );
    }
}