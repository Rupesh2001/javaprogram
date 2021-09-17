class employee
{
	private int emp_id;//data hiding
	public void setemp_id(int eid)//setter
	{
	emp_id=eid;
	}
	public int getemp_id()//getter
	{
	return emp_id;
	}
}
class encapsulation
{
	public static void main(String[] args)
{
	employee e=new employee();
	e.setemp_id(101);
	System.out.println("your data is"+e.getemp_id());
}
}