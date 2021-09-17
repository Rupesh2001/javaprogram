//super keyword to call constructor
class base
{
	int length,breadth;
	int height;
	base (int l, int b)
	{
		length=l;
		breadth=b;
		System.out.println("Area of room:"+(length*breadth));
	}
	base (int h)
	{
		height=h;
		System.out.println("height of room:"+height);
	}
}
class derived extends base
{
	//System.out.println("enter");=error constructor call (line:21-24 or 25-28) should be first
	derived (int l,int b)
	{
		super(l,b);
	}
	derived(int h)
	{
		super(h);
	}
}
class super_demo
{
	public static void main(String []args)
	{
		derived ob1=new derived (10,10);
		derived ob=new derived (10);
	}
}