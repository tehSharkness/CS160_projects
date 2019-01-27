
/**
 * Samuel Harkness
 * CS 160 - 07
 * Inlab #3
 * sets up the mutators, accessors, and constructors
 */
public class SimpleGradeBook
{
    private String name;
    private double grade;
    
    //accessors
    public String getName()
    { return name; }
    
    public double getGrade()
    { return grade; }
    
    //mutators
    public void setName( String nam )
    { name = nam; }
        
    public void setGrade( Double grd )
    { grade = grd; }
    
    //constructors   
    public SimpleGradeBook() //default constructor
    {
    }
    
    public SimpleGradeBook( String nam, double grad ) //proper constructor
    { name = nam;
      grade = grad;
    }
    
    
}
