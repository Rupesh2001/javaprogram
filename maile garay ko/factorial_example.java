/*Recursion*/
/*Example of factorial*/
class factorial
{
	int fact(int n)
	{
		if(n==1)
			return 1;
		else
			return fact(n-1)*n;	
	}
}
class factorial_example
{
	public static void main(String[] args) {
			factorial ob = new factorial();
			System.out.println("Factorial of 5: "+ob.fact(5));
		}	
}
