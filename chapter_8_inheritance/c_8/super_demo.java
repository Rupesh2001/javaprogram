class person{
	int age;
	String name;
	person(int a,String n){
		age=a;
		name=n;
	}
	void display(){
		System.out.print("name: "+name+" age: "+age);
	}
}
class student extends person{
	int roll;
	student(int a,String n,int r){
		super(a,n);//always should be first line of constructor of base class
		roll=r;
	}
	void display(){//method overridden
		super.display();//to avoid method overridden
		System.out.println(" roll: "+roll);
	}
}
class super_demo{
	public static void main(String []args){
		student ob=new student(12,"ram",5);
		ob.display();
	}
}