import java.util.Scanner;
class between

{
	public static void main(String[] args)
	{
		int x;
		System.out.println("enter x ");
		Scanner scan=new Scanner(System.in);
		x=scan.nextInt();
		int x[]= new int[5];
        for(int i=0;i<5;i++)
		{
            if(x[i]>16&&x[i]<47)
			{
                System.out.println(x[i]);

			}
			
		}
	}
}
