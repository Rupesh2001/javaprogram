// create an interface of two function
//	add(int x , int y)
//	prod(int x , int y)



interface number
{
	 int add (int x,int y);
	int prod (int x,int y);
}
class N implements number
{
	int sum,product;
	public int add (int x,int y)
	{
		sum=x+y;
		return sum;
	}
	public int prod (int x,int y)
	{
		product=x*y;
		return product;
	}
}
class interface_with_two_function
{
	public static void main(String[] args)
	{
		number N=new N();
		System.out.println("sum: "+N.add(5,6));
		System.out.println("product: "+N.prod(10,11));
	}
}