class stack{
	int a[]=new int[5];
	int top=-1;
	void push(int data){
		if (top==4){
			System.out.println("stack overflow");
			return;
		}
		else{
			++top;
			a[top]=data;
		}
	}
	void pop(){
		if (top<0){
			System.out.println("stack underflow");
			return;
		}
		else{
			System.out.println(a[top]);
			--top;
		}
	}
}
class stack_demo{
	public static void main(String []args){
		stack ob=new stack();
		for (int i=0;i<5;i++){
			ob.push(i+1);
		}
		for (int i=0;i<5;i++){
			ob.pop();
		}
	}
}