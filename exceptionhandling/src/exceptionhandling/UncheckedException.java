package exceptionhandling;
import java.util.*;
import java.io.*;
public class UncheckedException extends InputValidate{
	
	public static void main(String args[]) 
	{
		int num1,num2,out;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two Integers:");
		num1 = validateInt();
		num2 = validateInt();
		
		System.out.println("Enter the array size");
		int arr_size = validateInt();
		System.out.println("Enter the array elements");
		int arr[] = new int[arr_size];
		
		for(int iterator=0; iterator<arr_size; iterator++)
		{
			arr[iterator] = validateInt();
		}
		
		try
		{
			out = num1/num2;
			for(int i=0; i<=arr_size; i++)
			{
				System.out.println(arr[i]);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("trying to divide a number by zero");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("trying to get data from the index which is not found... ");
		}
		catch(Exception e)
		{
			System.out.println("unknown exception");
		}
		finally
		{
			System.out.println("Enter the correct values");
		}
		
	}

}
