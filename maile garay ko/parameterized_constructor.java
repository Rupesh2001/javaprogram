/*parameterized constructor*/
class box
{
	double width,height,depth;
	box(double w, double h, double d)
	{
		width=w;
		height=h;
		depth=d;
	}
	double show()
	{
		System.out.println("This is parameterized constuctor");
		return width*height*depth;
	}
}
class parameterized_constructor
{
	public static void main(String[] args) {
		box mybox = new box(20,10,5);
		box mybox1 = new box(15,100,5);
		System.out.println(mybox.show());
		System.out.println(mybox1.show());
	}
}