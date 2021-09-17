class PassArray
{
	static void show (int r[])
	{
		System.out.print("Numbers of args : "+v.length+" contents: ");
		for(int x:v)
			System.out.print(x+" ");
		System.out.print();	
	}
	public static void main(String[]args){
		int n1[] = {10};
		int n2[] = {1,2,3};
		int n3[] = {};
		show(n1);
		show(n2);
		show(n3);
	}
}