import java.util.Scanner;
import java.io.*;
class fill
{
	public static void main(String[] args)
	{
		try
		{
		FileWriter fw= new FileWriter("emp.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		String name,id,dob;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your name id and dob");
		name=scan.nextLine();
		id=scan.nextLine();
		dob=scan.nextLine();
		
		bw.write(name);
		bw.write(id);
		bw.write(dob);
		bw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
		try{
		FileReader fr=new FileReader("emp.txt");
		BufferedReader br=new BufferedReader(fr);
		String msg=null;
		while((msg=br.readLine())!=null)
		{
			System.out.println(msg);
		}
				br.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
		
	}
		
}
