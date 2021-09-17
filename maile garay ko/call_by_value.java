/*
	Argument Passing
	i)class by value
*/

class argument_pass
{
	void set (int i, int j)
	{
		i*=5;
		j+=5;
	}
}	
class call_by_value
{
	public static void main(String[] args) {
		argument_pass ob = new argument_pass();
		int p = 10; int q = 20;
		System.out.println(p+" "+q);
		ob.set(p,q);
		System.out.println(p+" "+q);
	}
}
