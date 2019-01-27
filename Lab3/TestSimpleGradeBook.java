/**
 * Samuel Harkness
 * CS 160 - 07
 * Inlab #3
 * Tests the SimpleGradeBook class
 */

import java.util.Scanner;

public class TestSimpleGradeBook
{
	public static void main(String args [])
	{
	    Scanner input = new Scanner( System.in );
	    
	    SimpleGradeBook one;
	    one = new SimpleGradeBook();
	    
	    //user prompt
	    System.out.println("Please enter a name: ");
	    //one.setName( input.next() ); //read string
	    
	    String inputa = input.next(); //variable for receiving input for name
	  
	    //user prompt
	    System.out.println("Please enter a grade: ");
	    //one.setGrade( input.nextDouble() ); //read double
	    
	    double inputb = input.nextDouble(); //variable for receiving input for grade
	    
	    one = new SimpleGradeBook( inputa, inputb ); //sets one.setName and one.getGrade
	    
	    //output
	    System.out.println( one.getName() + " has a grade of " + one.getGrade() );
	}
}
