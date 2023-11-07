// WAP to check whether the user input is prime number or not.

import java.util.Scanner;			//importing scanner

class Prime
{
	public static void main(String args[])
	{
		int n,i,m=0,flag=0;		//declaration of variable
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		n=sc.nextInt();
		
		m=n/2;
		if(n==0 || n==1)
		{
			System.out.println(n+" is a not prime number");
		}		
		else
		{				//checking for prime number
			for(i=2;i<=m;i++)
			{
				if(n%i==0)
				{
		 			System.out.println(n+" is a not prime number");
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(n+" is a Prime number");
			}
		}
		sc.close();			//Closing the Scanner
	}
}