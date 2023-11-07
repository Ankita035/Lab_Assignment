// WAP a program to reverse a given String without using reverse() method.

import java.util.*;

public class StrRev 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse: ");		//taking user input
		String input = sc.nextLine();
		String reversed;
		
		String str = input;						//coping input into str				
		char[] charArr = str.toCharArray();
		int left = 0;							//initializing left and right for swapping
		int right = charArr.length - 1;
		while (left < right) 						//if left is less than right it will get through
		{
										// Swap characters at left and right indices
			char temp = charArr[left];
			charArr[left] = charArr[right];
			charArr[right] = temp;
										// Move the indices towards each other
			left++;
			right--;
		}
		reversed = new String(charArr);
		System.out.println("Original String: " + input);
		System.out.println("Reversed String: " + reversed);
	}
}
