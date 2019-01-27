/**
 * Samuel Harkness
 * Sets the accessors, mutators, and constructors
 * Out-lab #3
 * 160 - 07
 * 9-29-05 
 */
public class Employee
{
	//instance variables
	private String firstName, lastName;
	private double salary;
	
	//constructors
	Employee()
	{
	    firstName = "";
	    lastName = "";
	    salary = 0.0;
	}//end constructor
	
	Employee( String frstNam, String lstNam, double sal )
	{
	    firstName = frstNam;
	    lastName = lstNam;
	    salary = sal;
	    
	    if( salary < 0.0 )
	    {
	        salary = 0.0;
	    }
	}//end constructor
	
	//accessors
	public String getFirstName()
	{ 
	    return firstName;
	}//end accessor
	
	public String getLastName()
	{
	    return lastName;
	}//end accessor
	
	public double getSalary()
	{
	    return salary;
	}//end accessor
	
	//mutators
	public void setFirstName( String four )
	{
	    firstName = four;
	}//end mutator
	
	public void setLastName( String five )
	{
	    lastName = five;
	}//end mutator
	
	public void setSalary( double six )
	{
	    salary = six;
	    
	    if( salary < 0.0 )
	    {
	        salary = 0.0;
	    }
	}//end mutator
	    
}//end class
