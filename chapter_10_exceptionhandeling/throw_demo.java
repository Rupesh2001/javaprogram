//throw exception
import java.util.Scanner;
class A{
	int b;
	void demo(int a)
	{
		b=a;
		if (b<18){
			throw new ArithmeticException("error");
		}
		else{
			System.out.println("hello");
		}
	}
}
class throw_demo{
	public static void main(String []args){
	Scanner s=new Scanner(System.in);
	System.out.println("enter age");
	int age=s.nextInt();
		A ob=new A();
		ob.demo(age);
	}
}