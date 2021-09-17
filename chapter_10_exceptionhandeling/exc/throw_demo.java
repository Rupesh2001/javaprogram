class throw_demo
{
	static void validate (int age)
	{
		if(age<18)
			throw new ArithmeticException("not a valid voter");
		else
		{			
			System.out.println("Welcome to election");
		}
	}
	public static void main(String []args)
	{
		validate(20);
		System.out.println("plese vote for a election");
	}
}