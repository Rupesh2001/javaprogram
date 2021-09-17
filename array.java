import java.util.Scanner;
class array
{
	public static void main(String[] args)
	{
	
		int i;
		int arr[]=new int[15];
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number");
		for(i=1;i<15;i++)
		{
			arr[i]=scan.nextInt();
		}
		for(i=1;i<15;i++)
		{
		if(arr[i]%5==0)
		{
			System.out.println(arr[i]+"divisible by 5");
		}
		if(arr[i]%6==0)
		{
			System.out.println(arr[i]+"divisible by 6");
		}
		}
		
		
	}
}
