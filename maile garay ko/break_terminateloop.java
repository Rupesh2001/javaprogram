class break_terminateloop
{
	public static void main(String[] args) {
		int i;
		for(i=0;i<100;i++)
		{
			if(i==10)
				break;
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Loop Completed");
	}
}