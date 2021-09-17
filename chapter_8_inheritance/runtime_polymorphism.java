//runtime polymorphism
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
		System.out.println("name: "+name+" age:"+age);
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
		System.out.println("name: "+name+" age:"+age+" phone no:"+phone);
	}
}
class runtime_polymorphism
{
	public static void main(String []args)
	{
		info ob1=new info("Ram",20);
		overriding ob=new overriding("Aashish",19,222222);
		info ref;
		ref=ob1;//upcasting
		ref.display();//print the method of superclass:info as ob1 is object of superclass
		ref=ob;//upcasting
		ref.display();//print the method of subclass only as ob is object of subclass:overriding
	}
}