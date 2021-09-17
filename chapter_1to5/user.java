import java.util.Scanner;
class user
{
	public static void main(String args[]) 
	{
		int i;
		System.out.println("enter  three number");
		int a[]=new int[3];

		Scanner sc=new Scanner(System.in);
		for(i=0;i<3;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(i=0;i<3;i++)
		{
			System.out.println (+a[i]);
		}

		System.out.print ("thank you");
		

	}
}