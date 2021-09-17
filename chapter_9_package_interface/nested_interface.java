//nested inheritance
interface info{
	interface name{
		void firstname(String fn);//nested
	}
	void Grade(int g);//not nested
}
class body implements info.name/*it points to nested*/,info{
	String fname;
	int grade;
	public void firstname(String fn){
		fname=fn;
		System.out.println("name:"+fname);
	}
	public void Grade(int g){
		grade=g;
		System.out.println("grade:"+grade);
	}
}
class nested_interface{
	public static void main(String []args){
		info.name ob=new body();
		info obj=new body();
		ob.firstname("aashish");
		obj.Grade(10);
	}
}	