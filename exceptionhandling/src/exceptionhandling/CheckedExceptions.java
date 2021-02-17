package exceptionhandling;
import java.util.*;
import java.io.*;
public class CheckedExceptions{

	public static void main(String args[]) throws IOException
	{
		FileReader file = new FileReader("C:\\Users\\prave\\git\\javasqlConnect\\javasqlconnect\\databasedetails.txt");
		BufferedReader br = new BufferedReader(file);
		for(int i=0; i<4; i++)
		{
			System.out.println(br.readLine());
		}
		
		br.close();
	}
}
