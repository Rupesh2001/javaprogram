class xpd{
	void display (Integer...x){
		for (Integer i:x){
			System.out.print(i);
		}
		System.out.println();
	}
	void display(int...a){
		for (int i:a){
			System.out.print(i);
		}
		System.out.println();
	}
}

class vararg_demo{
	public static void main(String []args){
		xpd ob1=new xpd();
		
		ob1.display(1);
	}
}