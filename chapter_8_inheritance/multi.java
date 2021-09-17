class a
{
	String name,sirname;
	void set(String n,String sn)
	{
		name=n;
		sirname=sn;
	}
}
class b extends a
{
	void show(String n,String sn)
	{
		set(n,sn);
		System.out.println("name:"+name+" "+sirname);
	}
}
class c extends a
{
	void display(String n,String sn)
	{
		set(n,sn);
		System.out.println("name :"+sirname+" "+name);
	}
}
class multi
{
	public static void main(String []args)
	{
		b ob1=new b();
		c ob2=new c();
		ob1.show("Aashish","Thapa");
		ob2.display("Aashish","Thapa");
	}
}