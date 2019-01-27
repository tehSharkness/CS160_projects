/**
 * Sam Harkness
 * Displays the original, squares, and cubes of 5 numbers
 * In-lab #2
 * 160 - 07
 * 9-13-05
 */

public class Two
{
    public static void main( String args[] )
    {
        int number1, number2, number3, number4, number5, square, cube; //initializes variables
        
        number1 = 1;
        square = number1 * number1;
        cube = number1 * number1 * number1;
        System.out.printf( "%d     %d     %d\n", number1, square, cube ); //display number1 and its powers
        
        number2 = 2;
        square = number2 * number2;
        cube = number2 * number2 * number2;
        System.out.printf( "%d     %d     %d\n", number2, square, cube ); //display number2 and its powers
        
        number3 = 3;
        square = number3 * number3;
        cube = number3 * number3 * number3;
        System.out.printf( "%d     %d     %d\n", number3, square, cube ); //display number3 and its powers
        
        number4 = 4;
        square = number4 * number4;
        cube = number4 * number4 * number4;
        System.out.printf( "%d     %d     %d\n", number4, square, cube ); //display number4 and its powers
        
        number5 = 5;
        square = number5 * number5;
        cube = number5 * number5 * number5;
        System.out.printf( "%d     %d     %d\n", number5, square, cube ); //display number5 and its powers

    } //end main method

}  //end class
      