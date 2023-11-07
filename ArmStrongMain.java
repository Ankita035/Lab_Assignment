// WAP to check whether the number is Armstrong number or not using class and object.

import java.util.Scanner;

class ArmstrongNumber 
{
	public boolean Armstrong(int num) 
	{	
        	int rem,arm=0;						//declaring variables 
		int input = num;

        	while (num > 0) 
		{
       	    		rem=num%10;					//extracting the last digit
			arm=(int)(Math.pow(rem, 3))+arm;		//cube the number and adding arm variable number
			num=num/10;					//removing the last number
        	}
        	return arm == input;					//comparing the original numbers to arm number
    	}
}

public class ArmStrongMain 
{
	public static void main(String[] args) 
	{
		int num;
        	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers : ");
		num=sc.nextInt();					//taking input from user
		
    	    	ArmstrongNumber checker = new ArmstrongNumber();	//creating a class
        	boolean isArmstrong = checker.Armstrong(num);	

        	if (isArmstrong) 					
		{			
            		System.out.println(num + " is an Armstrong number.");	
        	} 
		else 
		{
            		System.out.println(num + " is not an Armstrong number.");
        	}
    	}
}