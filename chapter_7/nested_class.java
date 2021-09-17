//nested class
class A
{
	int a=10;
	class B
	{
		int b=20;
		void show()
		{
			System.out.println("class A from B="+a);
		}
	}
	B ob=new B();
	void display()
	{
		System.out.println("class B from A="+(ob.b));
		ob.show();
	}
}
class nested_class
{
	public static void main(String []args)
	{
		A obj=new A();
		obj.display();
	}
}