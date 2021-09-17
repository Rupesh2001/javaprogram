/*parameter method ii*/
class doctors
{
	String specilization;
	int reg_no;
	int PAN;
	void set_value(String s,int r,int p)
	{
		specilization = s;
		reg_no = r;
		PAN = P;
	}
	String display()
	{
		return specilization+" "+reg_no+" "+PAN;
 	}
}
class method_parameter
{
	public static void main(String[] args) {
		doctor d = new doctor();
		d.set_value("Dentist",5645,111210);
		System.out.println(d.display());
	}

}