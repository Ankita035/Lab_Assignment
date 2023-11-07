//Create package MyArray to accept 10 values from user.

package array;

import java.util.Scanner;

public class MyArray
{
	public static int[] myArray()
	{
		int[] arr=new int[10];				//declaration of array
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter any 10 numbers with repeating the same: ");
		for (int i=0; i<arr.length; i++)			//taking inout from user
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}
}