import java.util.Scanner;

/**
 * Driver - the test program for CS 160, Program 4.
 * 
 * @author John Paxton 
 * @version November 2, 2008
 */

public class Driver
{
    public static void main (String [] args)
    {
        boolean done = false;   // indicates whether user is finished
        int choice;             // the user's choice
        int zipCode;            // a 5 digit zip code
        String barCode;         // a 32 character barcode
        Scanner in;             // the input source
        
        in = new Scanner(System.in);
        
        System.out.println("CS 160, Program 4, Zip Code Utilities");
        System.out.println("-------------------------------------");
        
        while (!done)
        {
            displayMenu();
            choice = getChoice(in);
            
            if (choice == ENCODE)
            {
                zipCode = ZipCode.getZipCode();
                System.out.println("Encoded: " + ZipCode.encode(zipCode));
            }
            else if (choice == DECODE)
            {
                barCode = ZipCode.getBarCode();
                System.out.println("Five digit zip code: " + 
                         ZipCode.decode(barCode));
            }
            else
            {
                System.out.println("Goodbye.");
                done = true;
            }
        }
    }
    
    private static void displayMenu()
    {
        System.out.println();
        System.out.println("1. Encode a zip code.");
        System.out.println("2. Decode a bar code.");
        System.out.println("3. Quit.");
        System.out.println();
    }
    
    private static int getChoice(Scanner in)
    {
        int choice;                // the user's choice
        boolean done = false;      // whether the user has made a choice
        
        choice = ENCODE;           //  initialize to avoid the compiler warning
        
        while (!done)
        {
            System.out.print("Please enter your selection: ");
            if (in.hasNextInt())
            {
                choice = in.nextInt();
                if ((choice >= ENCODE) && (choice <= QUIT))
                {
                    done = true;
                }
                else
                {
                    System.out.println("Error, invalid selection number.");
                }
            }
            else
            {
                System.out.println("Error, selection must be a number.");
            }
            in.nextLine();
        }
        return choice;
    }
    
    public static final int ENCODE = 1;     // user wants to encode a zip code
    public static final int DECODE = 2;     // user wants to decode a bar code
    public static final int QUIT = 3;       // user wants to quit
}
