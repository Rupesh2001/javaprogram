//method overriding
class A
{
	void display()
	{
		System.out.println("it is super class method");
	}
}
class B extends A
{
	void display()//override the display method of super class
	{
		System.out.println("it is sub class method");
	}
}
class method_overriding
{
	public static void main(String []args)
	{
		B a= new B();
		a.display();
	}
}