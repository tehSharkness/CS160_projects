/**
 * Samuel Harkness
 * Output the first five characters of each name.
 * In-lab #12
 * 160 - 07
 * 11-22-05 
 */

import java.util.Scanner;

public class Six
{
	public static void main( String[] args )
	{
		Scanner in = new Scanner( System.in );
		int count;
		String receive, test;
				
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
			test = receive.substring( 0, 5 );//splits the string up at the fifth character
			System.out.println( test );
		}
	}
}
