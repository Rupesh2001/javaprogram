//Write a progrma to call the function to display the radius of different class (void type function)
class rectangle//method creation
{
	int length,breath;
	
	void display()//function creation.
	{
		System.out.print("area= "+(length*breath));
	}
}
class areacall
{
	public static void main (String []args)
	{
		//making an object of method rectangle.
		rectangle ob=new rectangle();
		ob.length=10;
		//it will use the datatypes declared in class rectangle
		ob.breath=20;
		ob.display();
	}
}