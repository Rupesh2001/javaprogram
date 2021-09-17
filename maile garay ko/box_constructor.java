class box
{
	double width,height,depth;
	box()
	{
		width=10;
		height=8;
		depth=5;
		System.out.println("Example of Constructor");
	}
	void display()
	{
		System.out.println("Volumn of box: "+width*height*depth);
	}
}
class box_constructor
{
	public static void main(String[] args) {
		box mybox = new box();
		box mybox1 = new box();
		mybox.display();
		mybox1.display();

	}
}