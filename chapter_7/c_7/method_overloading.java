class overloading{
	int sum(int a,int b){
		return (a+b);
	}
	int sum(int a,int b,int c){
		return (a+b+c);
	}
	double sum(double a,double b){
		return (a+b);
	}
}

class method_overloading {
	public static void main(String []args){
		overloading ob=new overloading();
		
		System.out.println(ob.sum(1,2));
		System.out.println(ob.sum('a','b'));
		System.out.println(ob.sum(1,2,3));
		System.out.println(ob.sum(1.0,2));
	}
}