//Write a program to make a class name rectangles make a return type function to display the area of rectangles
import java.util.Scanner;
class rectangles
{
	int length,breath;
	int a;
	int display()
	{
		a=(length*breath);
		return a;
	}
}
class area_return
{
	public static void main (String []args)
	{
		Scanner s=new Scanner(System.in);
		int area;
		rectangles ob=new rectangles();
		System.out.println("enter length and breath :");
		ob.length=s.nextInt();
		ob.breath=s.nextInt();
		area=ob.display();
		System.out.println("area= "+area);
	}
}