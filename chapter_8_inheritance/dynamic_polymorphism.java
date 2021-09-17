
class A
{
	void abc()
	{
		System.out.println("kcmit");
	}
}
class B extends A
{
	void abc()
	{
		System.out.println("1234");
	}
}
class dynamic_polymorphism
{
	public static void main(String []args)
	{
		A a=new A();
		B b=new B();
		A ref;
		ref=a;
		ref.abc();
		ref=b;
		ref.abc();
	}
}