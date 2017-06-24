package gcd;

import java.util.Scanner;

public class Validator {
	
	public static String getString (Scanner sc, String prompt)
    {
        String s = " ";
		boolean isValid = false;
		while (isValid==false)
		{
        	System.out.print(prompt);
        	s = sc.next();
	        sc.nextLine();  // discard any other data entered on the line
	        if (s.equalsIgnoreCase("y") || s.equalsIgnoreCase("n")){
	    	   isValid = true;   
	        }
	        else
	        {
	    	   System.out.println("Your entry is invalid.");
	        } 
		}
		return s;
    }

    public static long getLong(Scanner sc, String prompt)
    {
        long i = 0;
        boolean isValid = false;
        while (isValid == false)
        {
            System.out.print(prompt);
            if (sc.hasNextLong())
            {
                i = sc.nextLong();
                isValid = true;
            }
            else
            {
                System.out.println("Error! Invalid integer value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return i;
    }
}
