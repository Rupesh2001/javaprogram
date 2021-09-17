/*Write a program to create a class called Employee having the following data members.
1.An ID for storing unique id allocated to every employee.
2.Name of employee.
3.age of an employee.

Also, provide the following methods-

4.A parameterized constructor to initialize name and age. The ID should be initialized in this constructor.
5.A method show() to display ID, name, and age.
6.A method showNextId() to display the ID of the next employee.*/

class employee{
	String name;
	int age;
	int id;
	static int nextid=1;
	
	employee(String n,int a){
		name=n;
		age=a;
		id=nextid;
		nextid++;
	}
	
	void show(){
		System.out.println(+id+". "+name+" "+age);
	}
	void shownextid(){
		System.out.println("next employee id : "+nextid);
	}
	protected void finalize(){
		--nextid;
	}
}
class employee_id{
	public static void main(String []args){
		employee a=new employee("ram",12);
		employee b=new employee("hari",13);
		
		a.show();
		b.show();
		a.shownextid();
		{
			//intern
			employee x=new employee("shyam",17);
			employee y=new employee("rabi",19);
			x.show();
			y.show();
			x=y=null;
			System.gc();//it will call finalize method at the end of program only once automatically
			System.runFinalization();//it will call finalize method 
			//no of call = the no of nulled object 
			//no in end of program unless it is in end
		}
		
		a.shownextid();
	}
}