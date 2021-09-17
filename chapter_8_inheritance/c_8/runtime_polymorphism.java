class A{
	void show(){
		System.out.println("this is class A");
	}
}
class B extends A{
	void show(){
		System.out.println("this is class B");
	}
}
class runtime_polymorphism{
	public static void main(String []args){
		A ob; 
		ob=new B();//upcasting
		ob.show();
		ob=new A();
		ob.show();
	}
}