//nested try
class nested_try
{
	public static void main(String []args){
		System.out.println("before");
		try{
			try{
				int b[]=new int[3];
				b[9]=8;
			}catch(Exception e){
				System.out.println("exception caught"+e);
			}
			int a=5/0;
		}catch(ArithmeticException a){
			System.out.println("exception caught"+a);
		}
		System.out.println("after");
	}
}