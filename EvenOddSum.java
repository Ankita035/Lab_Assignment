// WAP that reads a set of Integers, and then prints the sum of the even and odd integers. 

import java.util.Scanner;					//importing Scanner

class EvenOddSum
{
	public static void main(String args[])
	{
								//declaration of variables
		int sum_even=0,sum_odd=0,num;		
		char option;
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome!!!!!");
		
		do
		{						//taking number from user
			System.out.println("Enter a number ");
			num=sc.nextInt();
	
			if(num%2==0)				//if number is even
			{
				sum_even=sum_even+num;
			}
			else
			{
				sum_odd=sum_odd+num;
			}
			System.out.println("Do you want to continue? Yes or No");		//input from user yes or no
			option=sc.next().charAt(0);
		}
		while(option=='Y'||option=='y');
		{
		System.out.println("Sum of Even number is: "+sum_even);			  	//printing sum of even number
		System.out.println("Sum of Odd number is: "+sum_odd);				//printing sum of odd number
		}
		sc.close();					//close scanner
	}
}