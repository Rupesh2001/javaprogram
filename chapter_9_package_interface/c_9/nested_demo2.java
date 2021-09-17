class A{
	void display(){
		System.out.println("implementing display");
	}
	interface B{
		void show();
		interface C{
			void print();
		}
	}
}
class implementing implements A.B,A.B.C{
	public void show(){
		System.out.println("implementing show");
	}
	public void print(){
		System.out.println("implementing print");
	}
}
class nested_demo2{
	public static void main(String []args){
		A ob=new A();
		ob.display();
		A.B obj=new implementing();
		obj.show();
		
		A.B.C ob1=new implementing();
		ob1.print();
	}
}