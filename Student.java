//Create main class which will use package and calculate total marks and percentage.

package MCA;

public class Student
{								//declaration of variables
	public int r_no;
	public String name;
	public int a,b,c;
	int sum=0;
								//constructor for details
	public Student(int roll, String nm, int m1, int m2, int m3)
	{
		r_no=roll;
		name=nm;
		a=m1;
		b=m2;
		c=m3;
		sum=a+b+c;
	}
	public void display()
	{							//displaying the marks
		System.out.println("------------------");
		System.out.println("Roll No  :"+r_no);
		System.out.println("Name     :"+name);
		System.out.println("-------Marks------");
		System.out.println("Subject 1 :"+a);
		System.out.println("Subject 2 :"+b);
		System.out.println("Subject 3 :"+c);		
		System.out.println("------------------");
		System.out.println("Total     :"+sum);
		System.out.println("Percentage:"+sum/3);
		System.out.println("------------------");
		
	}
}