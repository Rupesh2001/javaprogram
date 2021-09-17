class overloading{
	overloading(int a,int b){
		System.out.println(a+b);
	}
	overloading(double a,double b){
		System.out.println("sum: "+(a+b));
	}
}
class constructor_overloading{
	public static void main(String []args){
		overloading ob=new overloading(1,2);
		overloading obj=new overloading(1.1,2.1);
	}
}