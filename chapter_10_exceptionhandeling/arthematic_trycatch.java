class arthematic_trycatch
{
	public static void main(String []args)
	{
		System.out.println("before");
		try{
			int a=10/0;
			System.out.println(+a);
		}catch(Exception e){
			System.out.println("error found :"+e);
		}
		System.out.println("after");//exception is handeled so this line will also be print
	}
}