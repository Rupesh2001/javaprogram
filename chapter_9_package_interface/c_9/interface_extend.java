interface A{
	void show();
}
interface B extends A{
	void display();
	void show();
}
class m implements A{
	public void show(){
		System.out.println("this is show in Super interface");
	}
}
class imp implements B{
	public void show(){
		System.out.println("this is show in Base interface");
	}
	public void display(){
		System.out.println("this is display");
	}
}
class interface_extend {
	public static void main(String []args){
		B ob=new imp();
		ob.show();
		ob.display();
		
		A obj;
		obj=new m();
		obj.show();
		
		obj=new imp();
		obj.show();
	}
}