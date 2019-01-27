
/**
 * Samuel Harkness
 * Establishes the objects and uses I/O to set the values for those objects
 * Out-lab #2
 * 160 - 07
 * 9-23-05
 */

import java.util.Scanner;

public class TestInvoice extends Invoice
{
	public static void main( String args [] )
	{
	    //object declaration
	    Scanner input = new Scanner( System.in );
	    Invoice one = new Invoice();
	    Invoice two = new Invoice();
	    
	    //hard-coded values for Invoice one
	    one.setPartNumber( "55555" );
	    one.setPartDesc( "Bolt" );
	    one.setQuantity( 5 );
	    one.setPrice( .25 );
	    
	    //user-prompts
	    System.out.println( "Please enter the part number: " );
	    two.setPartNumber( input.next() );
	    
	    System.out.println( "Please enter the part description: " );
	    two.setPartDesc( input.next() );
	    
	    System.out.println( "Please enter the part quantity: " );
	    two.setQuantity( input.nextInt() );
	    
	    System.out.println( "Please enter the price per unit: " );
	    two.setPrice( input.nextDouble() );
	    
	    //output
	    System.out.println( one );//uses the toString method
	    System.out.println( "The invoice price is: $" + one.getInvoiceAmount() );
	    System.out.println( two );//uses the toString method
	    System.out.println( "The invoice price is: $" + two.getInvoiceAmount() );
	}//end main
}//end class
