//multiple object using array
class setshow
{
	String name;
	int rank;
	void set (String na,int r)
	{
		name=na;
		rank=r;
	}
	void show()
	{
		System.out.println("Name: "+name+" Rank"+rank);
	}
}
class objectarray
{
	public static void main (String []args)
	{
		int i;
		setshow ob[]=new setshow[5];
		for (i=0;i<5;i++)
		{
			ob[i]=new setshow();
		}
		ob[0].set("kcmit",1);
		ob[1].set("acmit",11111);
		ob[2].set("bcmit",1111);
		ob[3].set("ccmit",111);
		ob[4].set("dcmit",11);
		for(i=0;i<5;i++)
		{
			ob[i].show();
		}
	}
}