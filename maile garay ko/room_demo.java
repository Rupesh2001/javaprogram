class room
{
	int length,breath,height;
	void set(int l,int b, int h)
	{
		length=l; breath=b;height=h;
	}
	void show()
	{
		System.out.println("volume is: "+length*breath*height);
	}
}
class room_demo
{
	public static void main(String[] args) {
		
		room r[]=new room[7];
		int i;
		for(i=0;i<7;i++)
		{
			r[i]=new room();
		}
		r[0].set(20,10,5);
		r[1].set(10,8,5);
		r[2].set(18,15,10);
		r[3].set(5,3,4);
		r[4].set(16,11,6);
		r[5].set(19,17,3);
		r[6].set(12,8,4);
		for(i=0;i<7;i++)
			{
				if (r[i].length<15) 
			r[i].show();
		}
	}
}