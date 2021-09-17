class throws_demo
{
	static void show() throws IllegalAccessException
	{
		System.out.println("inside show");
		throw new IllegalAccessException("example");
	}
	public static void main(String []args)
	{
		try
		{
			show();
		}
		catch(IllegalAccessException e)
		{
			System.out.println("caught "+e);
		}
	}
}