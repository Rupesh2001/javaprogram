/*program to take 3 number from user and display their average*/
import java.util.Scanner;
class average
{
	public static void main(String[] args) {
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.print("enter 3 numbers: ");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		float avg=(a+b+c)/3;
		System.out.println("average is: "+avg);
	}
}