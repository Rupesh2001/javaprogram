//from super_demo
//super keyword to call constructor
class base
{
	int length,breadth;
	base (int l, int b)
	{
		length=l;
		breadth=b;
		System.out.println("Area of room:"+(length*breadth));
	}
}
class derived extends base
{
	int height;
	derived (int l,int b)
	{
		super(l,b);
	}
	derived (int l,int b,int h)
	{
		super(l,b);
		height=h;
		System.out.println("heigth of room:"+height);
		System.out.println("volume of room:"+(length*breadth*height));
	}
}
class constructor_demo
{
	public static void main(String []args)
	{
		derived ob1=new derived (10,15);
		derived ob=new derived (10,5,2);
	}
}