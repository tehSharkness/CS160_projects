/**
 * Samuel Harkness
 * Tests the Employee class
 * Out-lab #3
 * 160 - 07
 * 9-29-05 
 */

import java.util.Scanner;

public class EmployeeTest
{
    public static void main( String args [] )
    {
        Scanner input = new Scanner( System.in );//establishes the Scanner object
        Employee one = new Employee();//establishes the first object
        
        System.out.print( "Please enter the employee's first name: " );//prompt
        one.setFirstName( input.next() );//sets the one object's First name to the User Input
        
        System.out.print( "Please enter the employee's last name: " );
        one.setLastName( input.next() );//sets the one object's Last name to the User Input
        
        System.out.print( "Please enter the employee's monthly salary: " );
        one.setSalary( input.nextDouble() );//sets the one object's monthly salary to the User Input
        
        String firstName, lastName;
        double salary;
        
        System.out.print( "/nPlease enter the employee's first name: " );
        firstName = input.next();
        
        System.out.print( "Please enter the employee's last name: " );
        lastName = input.next();
        
        System.out.print( "Please enter the employee's monthly salary: " );
        salary = input.nextDouble();
        
        Employee two = new Employee( firstName, lastName, salary);//establishes the second object using the user input
        
        System.out.println( one.getFirstName() + "'s annual salary is " + one.getSalary() * 12 );//prints out the one object's annual salary
        System.out.println( two.getFirstName() + "'s annual salary is " + two.getSalary() * 12 );//prints out the two object's annual salary
        
        System.out.println( one.getFirstName() + "'s annual salary after a 10% raise is " + one.getSalary() * 12 * 1.1 );//prints out the one object's annual salary after a 10% raise
        System.out.println( two.getFirstName() + "'s annual salary after a 10% raise is " + two.getSalary() * 12 * 1.1 );
        
    }//end main
}//end class