package exceptionhandling;

import java.util.Scanner;

public class InputValidate {

	public static int validateInt()
	{
		Scanner input = new Scanner(System.in);
		while(!input.hasNextInt()) //input validation
		{
			System.out.println("not a valid input...");
			System.out.println("expecting an integer...");
			System.out.println("Enter an integer:  ");
			input.next();
		}
		return input.nextInt();
	}

	
}
