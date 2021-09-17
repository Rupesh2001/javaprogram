//interface extended
interface name{
	void firstname();
}
interface fullname extends name{
	void sname();
}
class body implements fullname{
	public void firstname(){
		System.out.print("name: aashish");
	}
	public void sname(){
		System.out.println(" thapa");
	}
}
class extend_interface{
	public static void main(String []args){
		fullname ob=new body();
		ob.firstname();
		ob.sname();
	}
}