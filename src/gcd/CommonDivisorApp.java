package gcd;
import java.util.Scanner;

public class CommonDivisorApp {
 	
		private static long x = 0;
		private static long y = 0;

	public static void main(String[] args) {
		
		System.out.println("Welcome the Greatest Common Divisor Application\n");
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")){
			x = Validator.getLong(sc, "Enter first integer: ");
			y = Validator.getLong(sc, "Enter second integer: ");
			System.out.println("The greatest common divisor is " + calculateCommonDivisor(x, y) + ".\n");
			choice = Validator.getString(sc, "Would you like to play again? (y/n)");
				if (choice.equalsIgnoreCase("n"))
				{
					System.out.println("Bye-Bye!");
				}
				System.out.println();
		}
		
		sc.close();
	}
	
	public static long calculateCommonDivisor(long x, long y){
		
		if (y == 0)
		{
	        return x;
		}
		
		while (x != 0)
		{
			if(y > x)
			{
				y = y - x;
			}	
			else
			{
				x = x - y;		
			}
		}
		return y;
}
}

