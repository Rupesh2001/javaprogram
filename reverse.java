 
 import java.util.Scanner;
 class reverse
 {	
 public static void main(String[] args)
 {
	int a,b;
	int d=0;
	System.out.println("enter in string");
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	while(a>0)
	{
			
		b=a%10;
			a=a/10;
		d=(d*10)+b;
	
	}
	System.out.print("reverse is "+d);
 }
 }
	