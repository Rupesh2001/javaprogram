class varargs_method
{
	void show(int... x)
	{
		System.out.println("length of x: "+x.length);
		System.out.println("Values are: ");
		for(int p:x)
			System.out.println(p+" ");
		System.out.println();	
	}
}
class varargs_demo
{
	public static void main(String[]args)
	{
		varargs_method ob = new varargs_method();
		ob.show(1,5,0);
		ob.show();
		ob.show(2,4,6,8,10,15,17);
	}
}