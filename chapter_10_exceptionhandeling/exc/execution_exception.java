//creating own exception
class alphabeta extends Exception
{
	private int number;
	alphabeta(int n)
	{
		number=n;
	}
	public String toString()
	{
		return "alphabeta["+number+"]";
	}
}
class execution_exception
{
	static void sum (int a,int b) throws alphabeta
	{
		if (a<0)
			throw new alphabeta(a);
		else 
			System.out.println("sum "+(a+b));
	}
	public static void main (String []args)
	{
		try
		{
			sum(10,10);
			sum(-15,10);
		}
		catch(alphabeta e)
		{
			System.out.println(e);
		}
	}
}