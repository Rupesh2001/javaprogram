//one superclass multiple subclassclass one
{
	int length;
	one(int l)
	{
		length=l;
		show1();
	}
	void show1()
	{
		System.out.println("length of room:"+length);
	}
}
class two extends one
{
	int breadth;
	two(int l,int b)
	{
		super(l);//one(int l)
		breadth=b;
		show2();
	}
	void show2()
	{
		System.out.println("breadth of room:"+breadth);
	}
}
class three extends two
{
	int height;
	three (int l,int b,int h)
	{
		super(l,b);//call two(int l,int b)
		height=h;
		show3();
		System.out.println("volume of box:"+(length*breadth*height));
	}
	void show3()
	{
		System.out.println("height of box:"+height);
	}
}
class multi_constructor
{
	public static void main(String []args)
	{
		three ob=new three(2,2,2);
		System.out.println("length "+(ob.length));
	}
}