/*Crete class doctor with varibles specializations,salarys & hospital_names introduce a method for passing parameter and another method for displalying record now in main function declare 7 object of doctors and display the records of doctors with salary greater than 30,000*/
class doctor
{
	String specializations,hospital_names;
	int salarys;
	void pass_para (String sp,String hn,int sa)
	{
		specializations=sp;
		hospital_names=hn;
		salarys=sa;
	}
	void displaydoc()
	{
		System.out.println("specialization:"+specializations+"  Hospital Names:"+hospital_names+" Salary:"+salarys);
	}
}
class main_method
{
	public static void main (String []doc)
	{
		int i;
		doctor ob[]=new doctor[7];
		for (i=0;i<7;i++)
		{
			ob[i]=new doctor();
		}
		ob[0].pass_para("heart","kmc",80000);
		ob[1].pass_para("heart","kmc",70000);
		ob[2].pass_para("lungs","kmc",60000);
		ob[3].pass_para("kidney","kmc",40000);
		ob[4].pass_para("teeth","kmc",30000);
		ob[5].pass_para("mouth","kmc",20000);
		ob[6].pass_para("heart","kmc",90000);
		for (i=0;i<7;i++)
		{
			if (ob[i].salarys>30000){
				ob[i].displaydoc();
			}
		}
	}
}