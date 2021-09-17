class uncaught_exception{
	public static void main (String []args)
	{
		System.out.println("before");
		int a=10/0;
		System.out.println(+a);
		System.out.println("after");//program will stop as the exception is caught so this line will not be print
	}
}