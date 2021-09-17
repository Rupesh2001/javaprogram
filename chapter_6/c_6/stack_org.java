//stack organization
class stack{
	int a[]=new int[5];
	int top=-1;
	void push(int data){
		if (top==4){
			System.out.println("stack is full=stack overflow");
			return;
		}
		else{
			++top;
			a[top]=data;
		}
	}
	void pop(){
		if (top<0){
			System.out.println("stack is empty=stack underflow");
			return;
		}
		else{
			System.out.println(a[top]);
			--top;
		}
	}
}
class stack_org{
	public static void main(String []args){
		stack ob=new stack();
		
		ob.pop();
		ob.pop();
	}
}