//inheritance
//single inheritance
class first
{
	int a;
	void set()
	{
		a=5;
	}
	void display()
	{
		System.out.println("value of a from base class"+a);
	}
}
class second extends first
{
	int b;
	void set2 (int value2)
	{
		set();
		display();
		b=value2;
	}
	void show()
	{
		
		System.out.println("sum of a and b from derive class: "+(b+a));
	}
}
class inheritance_demo
{
	public static void main (String []args)
	{
		second ob=new second();
		ob.set2 (6);
		ob.show();
		ob.display();
	}
}