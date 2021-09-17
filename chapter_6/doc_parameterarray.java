import java.util.Scanner;
class doctor
{
	String specialization,hospital_name;
	int salary;
	void input_parameter(String sp,String h_name,int sal)
	{
		specialization=sp;
		hospital_name=h_name;
		salary=sal;
	}
	void display()
	{
		System.out.println(" hospital name: "+hospital_name+" specialization:"+specialization+" salary: "+salary); 
	}
}
class doc_parameterarray
{
	public static void main(String []args)
	{
		String spec,hosname;
		int sa;
		int i;
		Scanner s=new Scanner(System.in);
		doctor ob[]= new doctor[3];
		for (i=0;i<3;i++)
		{
			ob[i]=new doctor();
		}
		System.out.println("Enter specialization,hospital_name & salary");
		for (i=0;i<3;i++)
		{
			spec=s.nextLine();
			hosname=s.nextLine();
			sa=s.nextInt();
			ob[i].input_parameter(spec,hosname,sa);
			spec="";
			hosname="";
			sa=0;
		}
		for (i=0;i<3;i++)
		{ 
			if (ob[i].salary>30000){
				ob[i].display();
			}
		}
	}
}