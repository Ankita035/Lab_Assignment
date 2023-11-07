// Program to find the Greatest among Three numbers using Nested If.

import java.util.Scanner;			//importing Scanner

class GrIf
{
	public static void main(String args[])
	{	
		int num1,num2,num3;					//declaration of variables
		Scanner sc=new Scanner(System.in);
									//To input three numbers from user
		System.out.print("Enter first number : ");
		num1=sc.nextInt();
		System.out.print("Enter second number : ");
		num2=sc.nextInt();
		System.out.print("Enter third number : ");
		num3=sc.nextInt();
									//To find the greatest among three numbers using Nested If
		if(num1>num2)						
		{
			if(num1>num3)					
			{
				System.out.println("The greatest number is : "+num1);
			}
			else						
			{
				System.out.println("The greater number is : "+num3);
			}
		}
 		else 
		{	
			if(num2>num3)					
			{
				System.out.println("The greatest number is : "+num2);
			}
			else
			{	
				System.out.println("The greatest number is : "+num3);
			}
		}
		sc.close();						//close Scanner
	}	
}