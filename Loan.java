//WAP to check whether the person is eligible for getting loan or not. Condition to grant loan is he should have salary more than 50000 and he should be citizen of INDIA. Otherwise Loan can't be given.

import java.util.Scanner; 			// importing Scanner 

class Loan
{
	public static void main(String args[])
	{
		int sal;				//declaration of variable
		String str1="INDIA",nat;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Nationality : ");	
		nat=sc.nextLine();
							// if the given input is equal to string 1
		if(nat.equals(str1))				
		{
			System.out.println("Enter your Salary : ");
			sal=sc.nextInt();
			if(sal>50000)				
			{
				System.out.println("Congratulations!! You are Eligible for Loan. ");		
			}
		}
		else
		{
			System.out.println("You are not eligible to grant Loan.");
		}
		sc.close();				//Closing the Scanner
	}
}