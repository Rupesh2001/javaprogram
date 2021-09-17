//single inheritance
class person
{
	int age;
	void set(int a)
	{
		age=a;
	}
}
class student extends person
{
	void set(int a)
	{
		super.set(a);
	}
	void display()
	{
		System.out.println(age);
	}
}
class inheritance_demo1
{
	public static void main(String []args)
	{
		student ob=new student();
		ob.set(20);
		ob.display();
	}
}