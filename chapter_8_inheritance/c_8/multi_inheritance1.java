//hirarcial inheritance
class animal{
	int age;
	double size;
	animal(int age,double size){
		this.age=age;
		this.size=size;
	}
	void display(){
		System.out.print("Age: "+age+" size: "+size+"ft ");
	}
}	

class deer extends animal{
	String color;
	deer(int age,double size,String color){
		super(age,size);
		this.color=color;
	}
	void display(){
		System.out.println("Deer:");
		super.display();
		System.out.println(" color: "+color);
	}
	
	protected void finalize(){
		System.out.println("deer end");
	}
}

class rabbit extends animal{
	String color;
	String name;
	rabbit(int age,double size,String color,String name){
		super(age,size);
		this.color=color;
		this.name=name;
	}
	void display(){
		System.out.println("Rabbit:");
		super.display();
		System.out.println("name: "+name+" color: "+color);
	}
	
	protected void finalize(){
		System.out.println("rabbit end");
	}
}	

class multi_inheritance1{
	public static void main(String []args){
		deer ob=new deer(5,3.5,"red");
		ob.display();
		
		rabbit obj=new rabbit(2,1.1,"white","ram");
		obj.display();
		
		obj=null;
		ob=null;
		System.gc();
	}
}