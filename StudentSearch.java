// WAP to search given student name is available in the list of student name using String array.
	
import java.util.*;

public class StudentSearch 
{
	public static void main(String args[])
	{
		String[] studentNames = {"Ravina","Dhanashree","Rasika","Apurva","Akshay","Shubham"};		//Array containing students name 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the student name to search: ");						//taking user input to search
		String search = sc.nextLine();

		int foundIndex = -1;
		for (int i = 0; i < studentNames.length; i++) 
		{
														//comparing the user input with stored students name
			int comparisonResult = compareNames(studentNames[i].compareToIgnoreCase(search));	
														//if comparisonResult is 0, the names match
			if (comparisonResult == 0) 
			{
				foundIndex = i;
				break;
			}
		}
		if (foundIndex != -1)										//displaying if the name is found or not 
		{
			System.out.println("Student name found in the list.");
		} 
		else 
		{
			System.out.println("Student name not found in the list.");
		}
	}

														//This function is for clearer match status
	private static int compareNames(int compareToIgnoreCase)
	{
		if(compareToIgnoreCase == 0)
		{
			return 0;										//name match
		}
		else
		{
			return 1;										//name doesn't match
		}
	}
}