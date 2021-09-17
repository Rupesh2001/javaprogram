abstract class animal{
	abstract void animalsound();
}
class pig extends animal{
	void animalsound(){
		System.out.println("pig sound wee wee");
	}
}
class abstract_demo{
	public static void main(String []args){
		animal ob=new pig();
		ob.animalsound();
	}
}
