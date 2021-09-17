class example
{
	static int a = 50;
	static int b = 100;
	static void show()
	{
		System.out .println(a+" ");
		System.out.println("helloo ranish");
	}
}
class static_example
{
	public static void main(String[] args) {
		example.show();
		System.out.println(example.b);
	}
}