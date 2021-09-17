//super keyword to call super class variables and method
class sup_class
{
	int length;
	int breadth;
	void set(int l,int b)
	{
		length=l;
		breadth=b;
	}
	void area_display()
	{
		System.out.println("area of room:"+(length*breadth));
	}
}
class derived extends sup_class
{
	int height;
	void set2(int l,int b,int h)
	{
		set (l,b);
		height=h;
	}
	void show()
	{
		super.area_display();//super class metod area_display is called using super
		System.out.println("volume of room"+(super.length*super.breadth*height));
	}
}
class super_demo2
{
	public static void main (String []args)
	{
		derived subob=new derived();
		subob.set2(2,4,10);
		subob.show();
		
	}
}