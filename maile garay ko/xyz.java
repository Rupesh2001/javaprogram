class rectangle
{
	int length,breadth;
	rectangle()/*this is default constructor*/
	{
		System.out.println("This is a constructor");
	}
	rectangle(int length, int breadth)/*this is parameterized constructor*/
	{
		this.length = length;
		this.breadth = breadth;
		System.out.println("Area: "+length*breadth);
	}
}
class xyz
{
	public static void main(String[]args)
	{
		rectangle ob1 = new rectangle(15,9);/*this is parameterized constructor*/
		rectangle ob2 = new rectangle();/*this is default constructor*/
	}
}