	enum Apple
	{
	Jonathan,	GoldenDel, RedDel,	Winesap
	} 
			class	enumdemo
			{
			public static	void	main(String	args[])
			{
			Apple ap; ap	=	Apple.RedDel;
			System.out.println("Value	of	ap:	" + ap);
			ap =	Apple.Winesap;
			// Compare	two enum values.
			if (ap	== Apple.Winesap)
			System.out.println("ap	contains	Winesap.\n");
			
					switch(ap)
					{
					case	Jonathan:
					System.out.println("Jonathan	is red.");	break;
					case	GoldenDel:
					System.out.println("Golden	Delicious is	yellow.");break;
					case	RedDel:
					System.out.println("Red Delicious is	red.");break;
					case	Winesap:
					System.out.println("Winesap is	red."); break;
					}
				}
			}