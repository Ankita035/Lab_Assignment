/* Write a Java program which will generate the threads;
-To display 10 terms of Fibonacci series.
-To display 1 to 10 in reverse order.	*/

package com.lab.ankita;

class Fib extends Thread				//Fibonacci series Thread
{    	
	public void run()
	{
		int n = 10;
		int n1 = 0;
		int n2 = 1;
		System.out.println("Fibonacci Series:");
		System.out.print(n1 + " " + n2);

		for (int i = 2; i < n; i++) 
		{
			int n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
		System.out.println();
	}
}

class Rev extends Thread				//Reverse Thread
{
	public void run()
	{	
		System.out.println("Reverse Order:");
		for (int i = 10; i >= 1; i--) 
		{
			System.out.print(i + " ");
		}
		System.out.println();
	}
}

public class FibRev
{
	public static void main(String[] args) 
	{
					// TODO Auto-generated method stub		
		Fib f = new Fib();
		f.start();				//working and displaying fibonacci series

		try 
		{
			f.join();			//waiting for fibonacci completion 
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		Rev r = new Rev();
		r.start();				//working and displaying Reverse of 10 numbers.
	}
}
