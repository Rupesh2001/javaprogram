class ternary_operator
{
	public static void main(String[] args) {
		int x,y;
		x=100;
		y=x<0?-x:x;
		System.out.println("value of y is: "+y);
		x=-100;
		y=x<100?-x:x;
		System.out.println("value of y is: "+y);
	}
}