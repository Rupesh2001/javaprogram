interface A{
	interface B{
		void show();
		interface C{
			void print();
		}
	}
	void display();
}
class implementation implements A,A.B,A.B.C{
	public void display(){
		System.out.println("implementing display");
	}
	public void show(){
		System.out.println("Implementing show");
	}
	public void print(){
		System.out.println("Implementing print");
	}
}
class nested_demo{
	public static void main(String []args){
		A ob=new implementation();
		ob.display();
		A.B obj=new implementation();
		obj.show();
		A.B.C ob1=new implementation();
		ob1.print();
	}
}