/**
 * Samuel Harkness
 * Output all the names, each on a separate line, just as they were entered.
 * In-lab #12
 * 160 - 07
 * 11-22-05 
 */

import java.util.Scanner;

public class One
{
	public static void main( String[] args )
	{
		Scanner in = new Scanner( System.in );
		int count;
		
		System.out.print( "How many names? " );
		int input = in.nextInt();
		String[] str = new String[ input ];//establishes the string array with spaces corresponding to the input
		
		for( count = 0; count < input; count++ )
		{
			System.out.print( "Enter a first and last name: " );
			str[ count ] = in.next() + " " + in.next();//progressively assigns a string value to an array index
		}
		
		for( count = 0; count < input; count++ )
		{
			System.out.println( str[ count ] );//prints out each name
		}
	}
}