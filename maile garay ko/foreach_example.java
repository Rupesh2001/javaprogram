class foreach_example
{
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
		int sum=0;
		sum=1+2+3+4+5;

		for(int x:arr)
		{
			System.out.println(x);
		}
		System.out.println("sum "+sum);
	}
}