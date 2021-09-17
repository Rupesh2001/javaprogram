//Write a program to make a calss name cylinder with member variables radius & height and display the volume of 5 cylinder using the input from user.
import java.util.Scanner;
class cylinder
{
	int radius,height;
	void display() {
		System.out.println("volume of cylinder: "+(3.14*radius*radius*height));
	}
}
class volume_cylinderbycall 
{
	public static void main (String []args)
	{
		int i;
		Scanner s=new Scanner(System.in);
		cylinder ob0=new cylinder();
		cylinder ob1=new cylinder();
		cylinder ob2=new cylinder();
		cylinder ob3=new cylinder();
		cylinder ob4=new cylinder();
		
		System.out.println("enter 5 radius");
			ob0.radius=s.nextdouble();
			ob1.radius=s.nextInt();
			ob2.radius=s.nextInt();
			ob3.radius=s.nextInt();
			ob4.radius=s.nextInt();
			
		System.out.println("enter 5 height");
			ob0.height=s.nextInt();	
			ob1.height=s.nextInt();	
			ob2.height=s.nextInt();	
			ob3.height=s.nextInt();	
			ob4.height=s.nextInt();
			
		ob0.display();
		ob1.display();
		ob2.display();
		ob3.display();
		ob4.display();
	}
}