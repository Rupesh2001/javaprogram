import java.util.Scanner;
class cylinder{
		int radius,height;
		void display(){
			System.out.println("volume of cylinder :"+(3.14*radius*radius*height));
		}
}

class volume_cylinder{
	public static void main(String []args){
		Scanner s=new Scanner(System.in);
		
		//array of object
		cylinder ob[]=new cylinder[5];
		//for memory allocation of array object
		for (int i=0;i<5;i++){
			ob[i]=new cylinder();
		}
		
		//set the value
		System.out.println("enter 5 radius and height (radius height) :");
		for(int i=0;i<5;i++){
			ob[i].radius=s.nextInt();
			ob[i].height=s.nextInt();
		}
		
		//display the volume
		for (int i=0;i<5;i++){
			System.out.print("no."+i+" ");
			ob[i].display();
		}
	}
}