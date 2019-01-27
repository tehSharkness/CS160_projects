import java.util.Scanner;

/**
 * The function of this program is to be able to convert back
 * and forth between 5 digit zip codes (consisting of the numbers
 * 0 through 9) and 32 character bar codes (consisting of the characters '|' and ':').
 * 
 * @author Kyle Oliver
 * @version November 18th, 2008
 */

public class ZipCode
{

    public static int getZipCode()
    {
        
        Scanner in = new Scanner(System.in);
        int inputZip = 0; // the user's zip code
        boolean done = false; // whether the user has entered a valid zip code
  
        while (!done)
        {
            System.out.print("Please enter the zip code between 0 and 99999: ");
            if (in.hasNextInt())
            {
                inputZip = in.nextInt();
                if ((inputZip >= 0) && (inputZip <= 99999))
                {
                    done = true;
                }
                else
                {
                    System.out.println("Error, invalid number.");
                }
            }
            else
            {
                System.out.println("Error, that is not a number.");
            }
            in.nextLine();
        }        
        return inputZip;        
    }
    
    public static String encode(int zipCode)
    {
        // create answer array and blank user array for zip and check digit
        int[] digits = new int[6];
        int[][] code = { { 1, 1, 0, 0, 0 }, // 0
                         { 0, 0, 0, 1, 1 }, // 1
                         { 0, 0, 1, 0, 1 }, // 2
                         { 0, 0, 1, 1, 0 }, // 3
                         { 0, 1, 0, 0, 1 }, // 4
                         { 0, 1, 0, 1, 0 }, // 5
                         { 0, 1, 1, 0, 0 }, // 6
                         { 1, 0, 0, 0, 1 }, // 7
                         { 1, 0, 0, 1, 0 }, // 8
                         { 1, 0, 1, 0, 0 } }; // 9

        // extract digits
        for (int i = 4; i >= 0; i--)
        {
           digits[i] = zipCode % 10; // takes remainder and assigns to array i.e. 59421 % 10 = 1
           zipCode = zipCode / 10; // removes last digit from zip code i.e. 59421 turns into 5942
        }

        // computes the check digit
        int checkDigit = 0;
        
        for (int i = 0; i <= 4; i++)
        {
           checkDigit = checkDigit + digits[i];
        }
        
        digits[5] = 10 - (checkDigit % 10); // assigns check digit to last slot in array

        // checks each 1 and 0 in a particular number and returns the corresponding char i.e. | or :
        String barcodeZip = "";
        for (int i = 0; i <= 5; i++)
        {
           for (int j = 0; j <= 4; j++)
           {
              if (code[digits[i]][j] == 1)
              {
                barcodeZip = barcodeZip + "|";
              }
              else 
              {
                barcodeZip = barcodeZip + ":";
              }
           }
        }
      
      return "|" + barcodeZip + "|";
   }
    
    public static String getBarCode()
    {
        Scanner in = new Scanner(System.in);
        String inputBar = ""; // the user's bar code
        boolean done = false; // whether the user has entered a valid bar code
  
        while (!done)
        {
            System.out.print("Please enter a 32 character bar code: ");
            inputBar = in.next();
                if (inputBar.length() == 32)
                {
                    if (inputBar.startsWith("|"))
                    {
                        if (inputBar.endsWith("|"))
                        {
                        	//isValidSet(inputBar);
                            decode(inputBar);                            
                            if (isValid)
                            {
                                    if (checkDigitInt == ((50 - zipCodeInt) % 10))
                                    {
                                        done = true;
                                    }
                                    else
                                    {
                                        System.out.println("Error, check digit is incorrect.");
                                    }
                             }
                             else
                             {
                                 System.out.println("Error, the 5 character bar code starting at position " + errorPosition + " is invalid.");
                             }
                        }
                        else
                        {
                            System.out.println("Error, bar code must end with a |.");
                        }
                    }
                    else
                    {
                        System.out.println("Error, bar code must start with a |.");
                    }
                }
                else
                {
                    System.out.println("Error, bar code must contain 32 characters.");
                }
                in.nextLine();
           }    
        return inputBar;
    }
    
    public static String decode(String barCode)
    {
        String zipCodeStr = "";

        String checkDigitStr = "";
        String[] digits = new String[6];
        
        // the char key for each number combo possible
        String[] barCodeKey = {"||:::", // 0
            ":::||", // 1
            "::|:|", // 2
            "::||:", // 3
            ":|::|", // 4
            ":|:|:", // 5
            ":||::", // 6
            "|:::|", // 7
            "|::|:", // 8
            "|:|::"}; // 9
            
        
        int indexOne = 1;
        int indexTwo = 6;
        
        // creates 5 character sections representing the 5 zip code digits and check digit
        for (int i = 0; i < digits.length; i++)
        {
           digits[i] = barCode.substring(indexOne, indexTwo);
           indexOne = indexOne + 5;
           indexTwo = indexTwo + 5;
        }
        
        // computes check digit by comparing the 5th number in the digits array to the barCodeKey
        for (int i = 0; i < barCodeKey.length; i++)
            {
                
                if (digits[5].compareTo(barCodeKey[i]) == 0)
                {
                    checkDigitInt = i;
                }
            }
            
            
        // concatenates a zip code string by checking each digit against the key 
        for (int i = 0; i < digits.length-1; i++)
        {
            for (int j = 0; j < barCodeKey.length; j++)
            {                
                if (digits[i].compareTo(barCodeKey[j]) == 0)
                {
                    zipCodeStr = zipCodeStr + j;
                }
            }
            if(i+1 != zipCodeStr.length() && !isValid)
            {
            	isValid = false;
            	errorPosition = i*5+1;
            	break;
            }
        }
        
        
        
        if(isValid)
        {
	        zipCodeInt = Integer.parseInt(zipCodeStr); // creates int version of zip code
	        int[] zipArray = new int[5];
	        
	        // takes each individual number and puts it into an array
	        for (int i = 0; i < zipArray.length; i++)
	        {
	           zipArray[i] = zipCodeInt % 10;
	           zipCodeInt = zipCodeInt / 10;
	        }
	        
	        // adds together each digit from a 5 digit zip code i.e. 59421 = 21
	        for (int i = 0; i < zipArray.length; i++)
	        {
	            zipCodeInt = zipCodeInt + zipArray[i];
	        }
	
	        
	        return zipCodeStr;
        }
        else
        {
        	return "";
        }
    }
    
    private static void isValidSet(String barCode)
    {
        int indexOne = 1;
        int indexTwo = 6;
        String[] digits = new String[6];
        
        // creates 5 character sections representing the 5 zip code digits and check digit
        for (int i = 0; i < digits.length; i++)
        {
           digits[i] = barCode.substring(indexOne, indexTwo);
           indexOne = indexOne + 5;
           indexTwo = indexTwo + 5;
        }
        
        isValid = true;

    }  
    
    	private static boolean isValid = false;
        public static int errorPosition;
        public static int zipCodeInt = 0; // made these public so they can be called in getBarCode method
        public static int checkDigitInt = 0; // to validate the check digit
}
