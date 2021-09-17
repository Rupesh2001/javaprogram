//use of super keyword on method overriding
class info
{
	String name;int age;
	info(String s, int a)
	{
		name=s;
		age=a;
	}
	void display()
	{
		System.out.print("name: "+name+" age:"+age);
	}
}
class overriding extends info
{
	int phone;
	overriding(String s,int a,int ph)
	{
		super(s,a);
		phone=ph;
	}
	void display()//method overridden
	{
		super.display();//super keyword is used to call super class method
		System.out.println(" phone no:"+phone);
	}
}
class super_method_overriding
{
	public static void main(String []args)
	{
		overriding ob=new overriding("Aashish",19,222222);
		ob.display();
	}
}