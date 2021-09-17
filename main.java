class thread implements Runnable
{
	public void run()
	{
		for( int i=0;i<10;i++)
		{
			try
			{
				if(i%2==0)
				{
					System.out.println("even number is "+i);
					System.out.println(" wait five second");
					Thread.sleep(5000);
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
class threadb implements Runnable
{
	public void run()
	{
		for( int j=0;j<10;j++)
		{
			try
			{
				if(j%2!=0)
				{
					System.out.println("odd number is "+j);
					System.out.println(" wait five second");
					Thread.sleep(7000);
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
class main
{
	public static void main(String[] args)
	{
		thread ob = new thread();
		threadb obj=new threadb();
		Thread A,B;
		A=new Thread(ob);
		A.start();
		B=new Thread(obj);
		B.start();
	}
}
			
