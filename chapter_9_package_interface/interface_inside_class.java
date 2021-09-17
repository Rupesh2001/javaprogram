//interface inside class
class A{
	interface i{
		void show();
	}
}
class body implements A.i{
	public void show()
	{
		System.out.println("interface implemented");
	}
}
class interface_inside_class{
	public static void main(String []args)
	{
		A.i ob=new body();
		ob.show();
	}
}