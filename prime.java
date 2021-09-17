import java.util.Scanner;
class prime
{
	public static void main(String[] args)
	{
	int i,n,count=0;
	System.out.println("enter number");
	Scanner scan=new Scanner(System.in);
	n=scan.nextInt();
	for(i=1;i<=n;i++)
	{
		if(n%i==0)
		{
			count++;
		}
		
	}
	if(count==2)
	{
		System.out.println(n+"is prime");
	}
	else
	{
		System.out.println(n+" is not prime");
	}
	}
}