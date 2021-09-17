//Write a program to make a class name rectangle with a constructor to set length and breadth to instance variable make a return type function to display the area of rectangles

import java.util.Scanner;
class rectangle{
	int length,breadth;
	rectangle(int l,int b){
		length=l;
		breadth=b;
	}
	int display(){
		return (length*breadth);
	}
}

class rect_area_return{
	public static void main(String []args){
	
		//input from user
		Scanner s=new Scanner(System.in);
		System.out.println("Enter length and breadth");
		int length=s.nextInt();
		int breadth=s.nextInt();
		
		rectangle ob=new rectangle(length,breadth);
		System.out.println("area of rectangle: "+ob.display());
	}
}