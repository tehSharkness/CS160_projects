/**
 * Samuel Harkness
 * 
 * Search each name for the letter o, 
 * and if found output from o to the end of the name.
 * 
 * In-lab #12
 * 160 - 07
 * 11-22-05 
 */

import java.util.Scanner;

public class Seven
{
	public static void main( String[] args )
	{
		Scanner in = new Scanner( System.in );
		int count, length, test;
		String receive, subString;
				
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
			test = receive.indexOf( "o" );//returns -1 when "o" is not found
			length = receive.length();
			if( test != -1 )
			{
				subString = receive.substring( test, length );//splits the string from the "o" to the end of the string
				System.out.println( subString );
			}
		}
	}
}
