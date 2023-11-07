// Write a Java program to create multiple thread in Java. Apply thread properties too.(priority,name)

package com.lab.ankita;

class PriorityThread extends Thread			//Priority thread
{
	public void run()
	{
		System.out.println("Running thread has priority as "+Thread.currentThread().getPriority());
	}
}

public class Threadprop 
{
	public static void main(String[] args) 
	{
			// TODO Auto-generated method stub
        
		PriorityThread t1 = new PriorityThread();
		PriorityThread t2 = new PriorityThread();
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
			
		System.out.println("Priority Thread: ");
		t1.start();				//displaying max value
		try 
		{
			t1.join();			//waiting for max value 
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		t2.start();				//displaying min value
		try 
		{
			t2.join();			//waiting for min value 
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println();
							//customizing the thread name
		Thread t3 = new Thread("First Thread");	
		Thread t4 = new Thread("mysecondthread");
			
		t3.start();
		t4.start();
							//displaying thread names	
		System.out.println("Thread names are:");
		System.out.println(t3.getName());
		System.out.println(t4.getName());
	}
}
