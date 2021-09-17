class stack
{
	int stck[]=new int[5];
	int top;
	stack()
	{
		top=-1;
	}
	void push(int data)
	{
		if (top==4)
			System.out.println("stack overflow");
		else
			stck[++top]=data;
	}
	int pop()
	{
		if (top<0)
		{
			System.out.print("stack underflow");
			return 0;
		}
		else
		{
			return stck[top--];
		}
	}
}
class stack_demo
{
	public static void main(String []args)
	{
		int i;
		int a;
		stack ob=new stack();
		for (i=5;i<10;i++)
		{
			ob.push(i);
		}
		for (i=0;i<5;i++)
		{
			a=ob.pop();
			System.out.println(+a);
		}
	}
}