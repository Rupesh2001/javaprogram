/*Ambiguity in varargs method*/
class clg
{
	static void display(double... contact)
	{
		System.out.println("Contacts are: ");
		for(double d: contact)
			System.out.println(d+" ");
		System.out.println();	
	}
	static void display(String cname,double... contact)
	{
		System.out.println("Name: "+cname+"Contacts: ");
		for(double d: contact)
			System.out.println(d+" ");
		System.out.println();	
	}
	static void display(boolean... b )
	{
		System.out.println("Values are: ");
		for(boolean x:b)
			System.out.println(x+" ");
		System.out.println();		
	}
	
	public static void main(String[]args)
	{
		display();/*ambiguity occurs*/
		display("KCMIT",8525930,440666);
		display("NCC");
		display(44544);
		display(true,false,true);
	}
}
