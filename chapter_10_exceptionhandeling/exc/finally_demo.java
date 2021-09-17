class finally_demo
{
	public static void main (String []args)
	{
		try
		{
			System.out.println("hellow");
			int a=50/0;
			System.out.println(a);
		}
		catch(NullPointerException e)
		{
			System.out.println("Exception occours");
		}
		finally
		{
			System.out.println("Finally block Enter");
		}
		System.out.println("thanks for ");
	}
}