class college
{
	String name,address;
	int rank;
	void set(String n,String add, int r)
	{
		name=n; address=add;rank=r;
	}
	void show()
	{
		System.out.println(name+" "+address+" "+rank);
	}
}
class college_demo
{
	public static void main(String[] args) {
		
		college c[]=new college[5];
		int i;
		for(i=0;i<5;i++)
		{
			c[i]=new college();
		}
		c[0].set("KCMIT","Baneshwor",13);
		c[1].set("ABC","Chabahil",123);
		c[2].set("sdc","putalisadak",10);
		c[3].set("Global","Baneshwor",23);
		c[4].set("Apex","mid-baneshwor",37);
		for(i=0;i<5;i++)
			c[i].show();
	}
}