//Import created package to find particular element from the array using binary search algorithm.

import array.MyArray;

import java.util.Scanner;

public class BinarySearch
{
	public static void main(String args[])
	{
		int[] arr=MyArray.myArray();
		int search;
		int lowbit, uppbit, mid;						//declaration of variables
		Scanner sc=new Scanner(System.in);

		for (int i=0; i<arr.length; i++)					//sorting the array
		{
			for (int j=i+1; j<arr.length; j++)
			{
				if (arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("The sorted Array elements are: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+"   ");				//displaying the sorted numbers
		}

		System.out.println();
		System.out.println("Enter a number to Search element from Array: ");	//taking input for searching
		search=sc.nextInt();
		lowbit=0;
		uppbit=9;
		int flag=0;
		while (lowbit<=uppbit)							//method used to search using Binary Search Algorithm
		{
			mid=(lowbit+uppbit)/2;
			if (search==arr[mid])
			{
				flag=1;
				System.out.println("The Element "+search+" is present in Array at the index "+mid);
				break;
			}
			else if (search>arr[mid])
			{
				lowbit=mid+1;
			}
			else
			{
				uppbit=mid-1;
			}
		}
		if (flag==0)
		{
			System.out.println("The Element "+search+" is not present in Array.");
		}
	}
}