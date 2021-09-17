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
		super(a,n);
		roll=r;
	}
	void display(){
		super.display();
		System.out.print(" roll: "+roll);
	}
}
class grade_2 extends student{
	char grade;
	grade_2(int a,String n,int r,char grade){
		super(a,n,r);
		this.grade=grade;
	}
	void display(){
		super.display();
		System.out.println(" final grade: "+grade);
	}
}
class multi_level{
	public static void main(String []args){
		grade_2 ob=new grade_2(15,"ram",5,'A');
		ob.display();
		
	}
}