//parameterized Method
class university
{
	String name,address;//instance variables
	int rank;
	void set (String na,String ad,int r)//local variables of set function
	{
		name=na;
		address=ad;
		rank=r;
	}
	void display()
	{
		System.out.println("NAME: "+name+" Address: "+address+" Rank: "+rank);
	}
}
class parameterized_method
{
	public static void main(String []args)
	{
		university ob=new university();
		ob.set("ashish","Bhaktapur",20);
		ob.display();
	}
}