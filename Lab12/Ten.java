/**
 * Samuel Harkness
 * Enter and store the names First Last then output them Last, First.
 * In-lab #12
 * 160 - 07
 * 11-22-05 
 */

import java.util.Scanner;

public class Ten
{
	public static void main( String[] args )
	{
		Scanner in = new Scanner( System.in );
		int count, length, test;
		String receive, subString1, subString2;
				
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
			test = receive.indexOf( " " ) + 1;//finds the beginning of the last name
			length = receive.length();
			subString1 = receive.substring( 0, test - 1 );//breaks the string into 2
			subString2 = receive.substring( test, length );//substrings
			System.out.println( subString2 + ", " + subString1 );			
		}
	}
}
