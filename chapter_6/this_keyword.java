//"this" keyword
//write a program to find the area of square using two different class
class square
{
	int length;//instance variable
	void set(int length)//local variable
	{
		this.length=length;//this is in front of instance variable seperate the variable name if both instance and local are same
	}
	void display()
	{
		System.out.println("area= "+(length*length));
	}
}
class this_keyword
{
	public static void main(String args[])
	{
		square ob=new square();
		ob.set(10);
		ob.display();
	}
}