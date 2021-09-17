//program to make parameterized and non parameterized constructor and dispaly the area of 2 rectangle using both
class rectangle 
{
	int length,breath;
	rectangle()
	{
		length=10;
		breath=20;
	}
	rectangle (int length,int breath)
	{
		this.length=length;
		this.breath=breath;
	}
	void show()
	{
		System.out.println("area="+(length*breath));
	}
}
class p_and_non_constructor
{
	public static void main (String []agrs)
	{
		rectangle ob=new rectangle();
		rectangle ob1=new rectangle(1,5);
		ob1.show();
		ob.show();
	}
}