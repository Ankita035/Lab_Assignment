// WAP to swap two numbers without using third variable using class and object concept.

import java.util.Scanner;

class Swapping
{
	int a,b;
	public void swapNumbers() 
	{								//performing the swap number without using third variable			   
       		a = a + b; 						//the sum of both numbers are stored into "a"	
      		b = a - b;						//"b" is subtracted from "a" and stored into "b" 
     		a = a - b;						//"a" is subtracted from "b" and stored into "a"
    	}
}

public class Swapnumbers
{
 	public static void main(String[] args) 
	{
        	int num1,num2;						//declaring variables
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");		//taking first number from user
		num1=sc.nextInt();
		System.out.println("Enter second number");		//taking second number from user
		num2=sc.nextInt();
		
		Swapping swapper = new Swapping();			//creating a Class
        	swapper.a = num1;
      		swapper.b = num2;
        	swapper.swapNumbers();					//Calling the swapNumbers method to swap the numbers		

        								//Displaying the swapped values of a and b after swapping
		System.out.println("After Swapping the First numbers is : "+num1+" And the Second number is : "+num2);			
	}
}