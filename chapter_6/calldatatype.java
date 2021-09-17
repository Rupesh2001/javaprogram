class rectangle {
	int length,breath;
}
class calldatatype
{
	public static void main (String []args)
	{
		rectangle ob= new rectangle();
		rectangle ob1= new rectangle();
		//making object for rectangle method
		ob.length=20;ob.breath=30;
		ob1.length=1;ob1.breath=5;
		System.out.println(+(ob.length*ob.breath)+" "+(ob1.length*ob1.breath));
	}
}