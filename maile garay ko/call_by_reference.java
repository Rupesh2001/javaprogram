/*
	Argument Passing
	ii)class by Reference
*/

class argument_pass
{
	int p,q;
	void set(int i,int j)
	{
		p=i; q=j;
	}
	void change(argument_pass)
	{
		ob.p+=10;
		ob.q-=10;
	}
}	
class call_by_reference
{
	public static void main(String[] args) {
		argument_pass ob = new argument_pass();
		ob.set(15,20);
		System.out.println(ob.p+" "+ob.q);
		ob.change(ob);
		System.out.println(ob.p+" "+ob.q);     
	}
}
