//static keyword
//static donot required object to call can be call using class name
class stest
{	
	static void display()
	{
		System.out.println("static function is printed");
	}
	static String a="ashish";
	double b=2.5;
}
class static_demo
{
	public static void main(String []args)
	{
		stest ob=new stest();
		System.out.println("Static variable a ="+(stest.a));
		System.out.println("Static variable a ="+(ob.b));
		stest.display();
	}
}