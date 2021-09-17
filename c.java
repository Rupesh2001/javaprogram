

 
import java.util.Scanner; 
class c 
{ 
    public static void main(String[] args) 
    { 
		System.out.println("enter character");
        Scanner sc = new Scanner(System.in); 
   
        // Character input 
        char c = sc.next().charAt(0); 
   
        // Print the read value 
        System.out.println("your enter character is:"+c); 
    } 
}