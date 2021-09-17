//recursive program
class factorial{
	int result(int n){
		int i;
		if (n==1){return 1;}
		i=result(n-1)*n;//recursive method
		return i;
	}
}
class recursive_demo{
	public static void main(String []args){
		factorial ob=new factorial();
		int num=4;
		System.out.println("factorial of "+num+" : "+ob.result(num));
	}
}