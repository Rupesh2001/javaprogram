class balance
{
	String name;
	int bal;
	balance(String n, int b)
	{
		name = n;
		bal = b;
		System.out.println(name+" "+bal);
	}
	
}
class xyz_demo
{
	public static void main(String[] args)
	{
		balance ob[] = new balance[3];
		ob[0] = new balance("Ram",12345);
		ob[1] = new balance("Shyam",20000);
		ob[2] = new balance("Rupesh",15000);
	}
}