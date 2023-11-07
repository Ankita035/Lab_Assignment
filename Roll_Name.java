/*	Create a class Student having roll_ number,Name as fields .Create another class Marksdetails to accept 5 subject marks .Apply Single Inheritance to display the result.	*/

import java.util.Scanner;

class Student
{
	protected Scanner sc=new Scanner(System.in);
	String Name;
	int roll_num,maths,sci,eng,his,geo;						//declaring variables
	double per,total_Marks;

	public void base1()
	{										//taking Roll Number and Name from user 
		System.out.print("Enter Student Name: ");
		Name=sc.next();

		System.out.print("Enter your Roll Name: ");
		roll_num=sc.nextInt();
	}
}
class MarksDetails extends Student
{
	public void result1()
	{										//taking marks of the Subject from user
		System.out.println("Enter the Details :");
		System.out.println("sEnter Marks");
		System.out.println("\nEnter your Maths Marks: ");
		maths=sc.nextInt();
		System.out.println("\nEnter your Science Marks: ");
		sci=sc.nextInt();
		System.out.println("\nEnter your English Marks: ");
		eng=sc.nextInt();
		System.out.println("\nEnter your History Marks: ");
		his=sc.nextInt();
		System.out.println("\nEnter your Geography Marks: ");
		geo=sc.nextInt();
	}
	public void display1()
	{										//displaying the marksheet
		System.out.println("        MarkSheet");
		System.out.println("Roll Number : "+roll_num);
		System.out.println("Name        : "+Name);
		System.out.println("_________________________________");
		System.out.println("Maths       : "+maths);
		System.out.println("Science     : "+sci);
		System.out.println("English     : "+eng);
		System.out.println("History     : "+his);
		System.out.println("Geography   : "+geo);
		System.out.println("_________________________________");
		total_Marks=maths+sci+eng+his+geo;
		System.out.println("Total       : "+total_Marks);
		System.out.println("_________________________________");
		per=(total_Marks/500)*100;
		System.out.println("Percentage  : "+per);
	}
}

public class Roll_Name
{
	public static void main(String args[])
	{
		MarksDetails m=new MarksDetails();
		m.base1();								//input student details
		m.result1();								//input subject marks
		m.display1();								//display marksheet
	
	}
}