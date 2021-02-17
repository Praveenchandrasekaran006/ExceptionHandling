package exceptionhandling;

import java.io.*;
import java.util.*;

public class TryResource {
	
	public static void main(String args[]) throws Exception
	{
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
		{
			System.out.println("Enter the array size: ");
			int arr_size = Integer.parseInt(br.readLine());
			int arr[] = new int[arr_size];
			for(int iterator=0; iterator<arr_size; iterator++)
				arr[iterator] = iterator;
			for(int iterator=0; iterator<=arr_size; iterator++)
				System.out.println(arr[iterator]);		
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array index is not within the range");
		}
	}

}
