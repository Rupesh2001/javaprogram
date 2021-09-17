class length{
	//static instance variable
	//common to all object
	static int l;
	
	length(int l){
		this.l=l;
	}
	void display(){
		System.out.println("lenght: "+l);
	}
}

class A{
	//staic variable :43
	static String name="ashish";
	//static method in different class
	//call be call by using class name line:44
	static void show(){
		System.out.println("END");
	}
}

class static_demo{
	//static method
	static int sum(int a,int b){
		return(a+b);
	}
	//static block
	static {
		System.out.println("static block: "+sum(2,2));		
	}
	
	public static void  main(String []args){
		System.out.println("inside main: "+sum(1,2));
		
		length ob1=new length(2);
		length ob2=new length(3);
		
		ob1.display();
		ob2.display();
		
		System.out.println(A.name);
		A.show();
	
	}
}