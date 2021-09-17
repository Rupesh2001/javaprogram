//method overlapping
class student
{
	void show()
	{
		System.out.println("the name of college is kcmit");
	}
	void show(String name)
	{
		System.out.println("the name of college is "+name);
	}
}
class method_overlapping
{
	public static void main(String []args)
	{
		student ob=new student();
		ob.show();
		ob.show("SS");
	}
}