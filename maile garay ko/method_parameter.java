class doctor{
	String specilization;
	int reg_no;
	int PAN;
	void set_value(String s,int r,int p)

{
	specilization = s;
	reg_no = r;
	PAN = p;
}

void display()
{
	System.out.println("specilization is: "+specilization+"reg_no is: "+reg_no+"PAN"+PAN);

}
}
class method_parameter
{
	public static void main(String[] args) {
		doctor d=new doctor();
		d.set_value("dentist",5646,11234);
		d.display();
	}
}