/**
 * Samuel Harkness
 * 
 * Output each name just as it was entered, then, on the same line, 
 * output the number of characters in the name (space will count).
 * 
 * In-lab #12
 * 160 - 07
 * 11-22-05 
 */

import java.util.Scanner;

public class Four
{
	public static void main( String[] args )
	{
		Scanner in = new Scanner( System.in );
		int count, length;
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
			length = receive.length();//determines the length of the string as an integer
			System.out.println( receive + "\t" + length );//formats the string and integer
		}
	}
}
