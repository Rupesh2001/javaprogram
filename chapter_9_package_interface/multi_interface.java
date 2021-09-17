//multi level inheritance
interface one{
	void show();
}
interface two{
	void display();//abstracr & final
	String a="two";//always static public & final 
}
class body implements one,two{
	public void show(){
		System.out.println("this is level one of interface");
	}
	public void display(){
		System.out.println("this is level "+a+" of interface");
	}
}
class multi_interface{
	public static void main(String []args){
		one ob=new body();
		two obj=new body();
		ob.show();
		obj.display();
	}
}