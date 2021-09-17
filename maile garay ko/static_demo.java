/*static keyword*/
class static_demo
{
	static int a = 100;
	static int b;
	static void show(int c)
	{
		System.out.println(a+" "+b+" "+c);
	}
	static
	{
		System.out.println("Static Block");
		b= a+50;
	}
	public static void main(String[]args){
		show(200);
	}
}