// Write a Package MCA which has one class Student. Accept students details through parameterized constructor. Write display() method to display details. 

import MCA.Student; 					//importing ﻿student class

import java.util.Scanner;

class MCAs
{
	public static void main(String args[])
	{
		String nm;					//declaration of variables
		int roll;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your Roll No.: ");	//taking input from user
		roll=sc.nextInt();
		System.out.print("Enter your Name: ");
		nm=sc.next();
		int m1,m2,m3;
		System.out.print("Enter marks of your 3 subject: ");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();

		Student s=new Student(roll,nm,m1,m2,m3);
		s.display();
	}
}