interface A
	{
		interface B
			{
				void show();
				
					interface C
						{
							void print();
						}
			}
		void display();
	}

class implementation implements A,A.B,A.B.C

	{
		public void display()
			{
				System.out.println("display interface A");
			}
		public void show()
			{
				System.out.println("show interface B");
			}
		public void print()
			{
				System.out.println("print interface C");
			}
	}
class nested_interface
	{
		public static void main(String[] args)
		{
			A ob=new implementation();
			A.B ob1=new implementation();
			A.B.C ob2=new implementation();
			ob.display();
			ob1.show();
			ob2.print();
		}
	}
			
			
	