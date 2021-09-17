//wap to display the area of the circle, rectangle and square using the concept of method overlapping
class area
{
	void area (double radius)
	{
		System.out.println("the area is: "+(3.4*radius*radius));
	}
	void area (int length,int breadth)
	{
		System.out.println("the area is: "+(length*breadth));
	}
	void area (int length)
	{
		System.out.println("the area is: "+(length*length));
	}
}
class method_overlapping_area
{
	public static void main(String []args)
	{
		area ob=new area();
		ob.area(11);
		ob.area(1.1);
		ob.area(1,2);
	}
}