/*program to take your name, age, rol, height and gender of user and display them*/
import java.util.Scanner;
class user_input
{
	public static void main(String[] args) {
		String name; int age,roll;
		float height; char gender;
		Scanner s = new Scanner(System.in);
		System.out.println("enter your name: ");
		name = s.nextLine();
		System.out.println("enter age and roll: ");
		age = s.nextInt();
		roll = s.nextInt();
		System.out.println("enter your height: ");
		height = s.nextFloat();
		System.out.println("enter your gender: ");
		gender = s.next().charAt(0);

		System.out.println(name+" "+age+" "+roll+" "+height+" "+gender);
	}
}