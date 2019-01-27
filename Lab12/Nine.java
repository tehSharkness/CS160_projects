/**
 * Samuel Harkness
 * Output all the names that end with an e.
 * In-lab #12
 * 160 - 07
 * 11-22-05 
 */

import java.util.Scanner;

public class Nine
{
	public static void main( String[] args )
	{
		Scanner in = new Scanner( System.in );
		int count;
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
			if( receive.endsWith( "e" ) )//determines if the string ends with "e"
				System.out.println( receive );
		}
	}
}
