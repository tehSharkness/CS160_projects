/**
 * Samuel Harkness
 * 
 * Output all the names that contain an a, 
 * replacing the a with an x.
 * 
 * In-lab #12
 * 160 - 07
 * 11-22-05 
 */

import java.util.Scanner;

public class Eight
{
	public static void main( String[] args )
	{
		Scanner in = new Scanner( System.in );
		int count, test;
		String receive;
				
		System.out.print( "How many names? " );
		int input = in.nextInt();
		String[] str = new String[ input ];
		
		for( count = 0; count < input; count++ )
		{
			System.out.print( "Enter a first and last name: " );
			str[ count ] = in.next() + " " + in.next();
		}
		
		for( count = 0; count < input; count++ )
		{
			receive = str[ count ];
			test = receive.indexOf( "a" );//returns -1 if "a" is not found
			if( test != -1 )
			{
				receive = receive.replace( "a", "x" );//replaces a with x
				System.out.println( receive );
			}
		}
	}
}
