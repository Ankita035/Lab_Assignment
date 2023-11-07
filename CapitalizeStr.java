// Write a java program to capitalize each word in string.

import java.util.*;

public class CapitalizeStr 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string for the operations: ");		//taking input from user
		String str1 = sc.nextLine();
		String upper = str1.toUpperCase();					//converting string to uppercase 
		System.out.println("The Uppercase of the string is: "+ upper);		//displaying the uppercase
	}
}