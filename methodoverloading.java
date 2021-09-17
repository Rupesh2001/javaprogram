//method overloading
class a
{
	int sum(int a,int b)
	{
		
		return (a+b);
	}
	int sum(int a,int b,int c)
	{

		return (a+b+c);
	}
}
class methodoverloading
{
	public static void main(String[] args)
	{
		a ob=new a();
		System.out.println(ob.sum(4,5));
		System.out.println(ob.sum(6,5));
	}
}
