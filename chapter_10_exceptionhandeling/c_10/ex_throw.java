import java.util.Scanner;
class ex_throw{
	static void show(int a){
		if (a<18)
			throw new ArithmeticException("underage");
	
			
		System.out.println("this is only 18+");
		
		System.out.println("hellow");
	}
	public static void main(String []args){
		Scanner s=new Scanner(System.in);
		System.out.println("enter age");
		int age=s.nextInt();
		
		System.out.println("before");
		
		try{
			show(age);
		}catch(Exception e){
			System.out.println("caught: "+e);
		}
		
		System.out.println("after");
	}
}