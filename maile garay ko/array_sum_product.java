
import java.util.Scanner;
class array_sum_product
{
	public static void main(String[] args)
 {
		int arr[] = new int[10];
		int i;
		Scanner s = new Scanner(System.in);
		for(i=0;i<10;i++)
		{
			if(arr%2==0)
			{
				System.out.println("sum of even number: "+i);
			}
		}
	}
}