/*example constructor demo*/
class student
{
	student()
	{
		System.out.println("Students of KCMIT college makes lots of noise in class.");
	}
}
class constructor_demo
{
	public static void main(String[] args) {
		student ob = new student();
		student obj = new student();
	}
}