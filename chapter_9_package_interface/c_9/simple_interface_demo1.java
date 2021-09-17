interface addition{
	final int a=5;
	int sum(int b);
}
class add_implement implements addition{
	public int sum(int b){
		return (a+b);
	}
}
class simple_interface_demo1{
	public static void main(String []args){
		addition ob=new add_implement();
		System.out.println(ob.sum(2));
	}
}