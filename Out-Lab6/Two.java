import java.util.Scanner;

public class Two
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner( System.in );
        
        System.out.print( "Please enter a number: " );
        String input = in.next();
        
        System.out.println( reverse( input ) );
    }
    
    public static String reverse( String in )
    {
        final int LIMIT = in.length();
        int count;
        String out = "";
        
        for( count = 1; count <= LIMIT; count++ )
        {
            out += in.charAt( in.length() - count );
        }
        
        return out;
    }

}
