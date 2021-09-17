class std
{
	static void display(long... contact)
	{
		System.out.println("Contacts are: ");
		for(long c: contact)
			System.out.println(c+" ");
		System.out.println();	
	}
	static void display(String name,long... contact)
	{
		System.out.println("Name: "+name+"Contacts: ");
		for(long c: contact)
			System.out.println(c+" ");
		System.out.println();	
	}
	public static void main(String[]args)
	{
		display();
		display("Ranish",18525930);
		display("Rupesh");
		display(44544);
	}
}
