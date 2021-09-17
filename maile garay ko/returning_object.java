/*Returning object:*/
class number
{
	int p;
	number(int i)
	{
		p=i;
	}
	number multiply_by_five()
	{
		number ob = new number(p*5);
		return ob; 
	}
}
class returning_object
{
	public static void main(String[] args) {
		number ob1 = new number(2);
		number ob2 = ob1.multiply_by_five();
		System.out.println(ob1.p+" "+ob2.p);
		ob2 = ob2.multiply_by_five();
		System.out.println(ob2.p);
	}
}