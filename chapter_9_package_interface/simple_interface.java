interface myinfo{
	String name;
	String sname;
	void name(String n,String sn);
	void show();
}
class info implements myinfo{
	public void name(String n,String sn){//method should always be public as it is abstract method body part of interface
		name=n;
		sname=sn;
	}
	public void show(){
		System.out.println("name:"+name+" "+sname);
	}
}
class simple_interface{
	public static void main(String []args){
		myinfo ob =new info();//or info ob =new info(); :w3school
		ob.name("Ashish","thapa");
		ob.show();
	}
}