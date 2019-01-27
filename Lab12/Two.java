/**
 * Samuel Harkness
 * Output all the names using only lower case letters.
 * In-lab #12
 * 160 - 07
 * 11-22-05 
 */

import java.util.Scanner;

public class Two
{
	public static void main( String[] args )
	{
		Scanner in = new Scanner( System.in );
		int count;
		String lower;
		
		System.out.print( "How many names? " );
		int input = in.nextInt();
		String[] str = new String[ input ];
		
		for( count = 0; count < input; count++ )
		{
			System.out.print( "Enter a first and last name: " );
			lower = in.next() + " " + in.next();//temporarily stores the input in a string variable
			str[ count ] = lower.toLowerCase();//changes all letters to lowercase
		}
		
		for( count = 0; count < input; count++ )
		{
			System.out.println( str[ count ] );
		}
	}
}
