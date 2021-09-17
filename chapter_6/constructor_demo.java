//constructor
class first_constructor
{
	first_constructor(int value)//no type in front of constrluctor name eg: void first_constructor
	{
		System.out.println("hellow "+value);
	}
}
class constructor_demo
{
	public static void main(String []args)
	{
		first_constructor ob=new first_constructor(5);
	}
}