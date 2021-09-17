class A{
	int length;
	int breadth;
	A(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	
	A(A o,int breadth){
		length=o.length;
		this.breadth=breadth;
	}
	
	void display(){
		System.out.println("area: "+(length*breadth));
	}
}
class ob_as_p{
	public static void main(String []args){
		A ob=new A(2,3);
		ob.display();
		A ob2=new A(ob,5);
		ob2.display();
	}
}