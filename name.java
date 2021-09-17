
import java.util.Scanner;
class name
	{
		public static void main(String args[])
		{
		int i;
		Scanner Scan=new Scanner(System.in);
		String a[]=new String[5];
		System.out.print("enter your name : ");
		for(i=1;i<5;i++)
		{
			a[i]=Scan.nextLine();
		}
		for(i=1;i<5;i++)
			{
				if(a[i].startsWith("a"))
				{
					System.out.println("name list name start with a" +a[i]);
				}
			}
		}
		
	}	