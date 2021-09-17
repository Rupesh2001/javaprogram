/*Access Control*/
class Access
{
	int a;
	public int b;
	private int c;
	void set(int i)
	{
		c=i;
	}
	void show()
	{
		System.out.println(c);
	}
}
class access_control
{
	public static void main(String[] args) {
		Access ob=new Access();
		ob.a=10;
		ob.b=20;
		/*ob.c=30; error*/
		ob.set(30);
		System.out.println(ob.a+" "+ob.b+" ");
		ob.show();
	}
}