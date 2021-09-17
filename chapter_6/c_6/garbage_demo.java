//garbage collection

class A{
	void display(){
		System.out.println("Hellow world");
	}
	protected void finalize(){
		System.out.println("call");
	}
}

class garbage_demo{
	public static void main(String []args){
		
		A ob1=new A();
		A ob2=new A();
		A ob3=new A();
		
		ob1.display();
		ob2.display();
		ob3.display();
		
		ob1=null;
		ob2=null;
		ob3=null;
		
		System.gc();//it will call finalize method at the end of program only once automatically if System.runFinalization(); is not written
		
		System.runFinalization();
		//it will call finalize method 
		//no of call = the no of nulled object 
		//no in end of program unless it is in end
		
		System.out.println("end");
	}
}