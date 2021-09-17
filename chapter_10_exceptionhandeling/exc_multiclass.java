class A{
	void show(){
		int a=5/0;
	}
}
class exc_multiclass{
	public static void main(String []args)
	{
		System.out.println("after");
		try{
			A ob=new A();
			ob.show();
		}catch(Exception e){
			System.out.println("error "+e);
		}
		System.out.println("before");
	}
}