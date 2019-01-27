/**
 * Samuel Harkness
 * Output all the names using only upper case letters.
 * In-lab #12
 * 160 - 07
 * 11-22-05 
 */

import java.util.Scanner;

public class Three
{
	public static void main( String[] args )
	{
		Scanner in = new Scanner( System.in );
		int count;
		String upper;
		
		System.out.print( "How many names? " );
		int input = in.nextInt();
		String[] str = new String[ input ];
		
		for( count = 0; count < input; count++ )
		{
			System.out.print( "Enter a first and last name: " );
			upper = in.next() + " " + in.next();
			str[ count ] = upper.toUpperCase();//changes all letters to upper case
		}
		
		for( count = 0; count < input; count++ )
		{
			System.out.println( str[ count ] );
		}
	}
}
