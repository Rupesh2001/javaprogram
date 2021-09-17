//multi level inheritance
class A
{
	int length;
	void set(int l)
	{
		length=l;
		show();
	}
	void show()
	{
		System.out.println("length of box:"+length);
	}
}
class B extends A
{
	int breadth;
	void set2(int b)
	{
		breadth=b;
		show2();
	}
	void show2()
	{
		System.out.println("breadth of box:"+breadth);
	}
}
class C extends B
{
	int height;
	void volume(int l,int b,int h)
	{	
		set(l);
		set2(b);
		height=h;
		show3();
		System.out.println("volume of box:"+(length*breadth*height));
	}
	void show3()
	{
		System.out.println("height of box:"+height);
	}
}
class multi_inheritance
{
	public static void main(String []args)
	{
		C ob=new C();
		ob.volume(2,2,2);
		System.out.println(""+ob.length);
	}
}