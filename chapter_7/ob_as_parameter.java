//object as parameter
class oaptest
{
	int length;
	void rectangle(int l)
	{
		length=l;
	}
	void rectangle2(oaptest obj)
	{	
		length=obj.length;
	}
	void show()
	{
		System.out.println("length="+length);
	}
}
class ob_as_parameter
{
	public static void main(String []args)
	{
		oaptest ob=new oaptest();
		ob.rectangle(10);
		ob.show();
		oaptest ob1=new oaptest();
		ob1.rectangle2(ob);
		ob1.show();
	}
}