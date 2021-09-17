//variable length arguements
class varargs_method
{
	void show (String a,int...i)
	{
		System.out.print("name "+a+" length of arguements="+(i.length)+" values are = ");
		for (int x:i)
			System.out.print(x+" ");
		System.out.println();
	}
}
class varargs_demo
{
	public static void main(String []args)
	{
		varargs_method ob=new varargs_method();
		ob.show("Ram");
		ob.show("Aashish kr. thapa",1,2,4,5);
	}
}	