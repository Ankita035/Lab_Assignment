//WAP to generate prime numbers between 1 to 100.

class Primenum
{
	public static void main(String args[])
	{
		int i,j,count,n=100;			//declaration of variable
		for(j=2;j<=n;j++)
		{					//generating prime numbers from 1 to 100
			count=0;
			for(i=1;i<=j;i++)
			{
				if(j%i==0)
				{	
					count++;
				}
			}
			if(count==2)
			{	
				System.out.print(j+"  ");	//displaying prime numbers
			}
		}
	}
}