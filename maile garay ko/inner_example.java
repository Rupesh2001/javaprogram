class outer
{
	int a = 50;
	class inner
	{
		void show()
		{
			System.out.println("value of a is: "+a);
		}
	}
	void display()
	{
		inner ob = new inner();
		ob.show();
	}
}
class inner_example
{
	public static void main(String[]args){
		outer out = new outer();
		out.display();
	}	
}