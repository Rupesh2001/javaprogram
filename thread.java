class thread
{
	public static void main(String[] args)
	{
		Thread t=Thread.currentThread();
		System.out.println("current thread"+t);
		t.setName("my thread");
		
		System.out.println("after name change"+t);
		try{
			System.out.println("hello");
			System.out.println("this is thread");
			System.out.println("bye bye");
			System.out.println("mango");
				Thread.sleep(2000);
				t.setPriority(1);
			}
		
		
		catch(InterruptedException e)
		{
			System.out.println("main thread executed");
		}
		try{
			System.out.println("hello2");
			System.out.println("this is thread2");
			System.out.println("bye bye2");
			System.out.println("mango2");
				Thread.sleep(6000);
				t.setPriority(4);
			}
		
		
		catch(InterruptedException e)
		{
			System.out.println("main thread executed");
		}
	}
}