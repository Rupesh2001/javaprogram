//multiple exception
class ex_handel1{
	public static void main(String []args){
		System.out.println("before");
		
		String x[]=new String[2];
		try{
			int a=1/2;
			x[1]="asish";
			
		}catch(ArithmeticException l){
			System.out.println("this is arthematic exception");
		}catch(Exception e){
			System.out.println(e);
		}
		finally{
			System.out.println("this is finally");
		}
		System.out.println("after");
	}
}