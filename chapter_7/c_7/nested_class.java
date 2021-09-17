//nested class inside the block
class A{
	int a=5;
	void test(){
		for (int i=0;i<5;i++){
			class B{
				void display(){
					System.out.println(a);
				}
			}
			B ob=new B();
			ob.display();
		}
	}
}
class nested_class{
	public static void main(String []args){
		A ob=new A();
		ob.test();
	}
}