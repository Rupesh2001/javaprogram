/*Command line*/
class command_line
{
	public static void main(String[] args) {
		int i;
		for(i=0;i<args.length;i++)
			System.out.println("args["+i+"]: "+args[i]);
	}
}

/*to compile= javac command_line
to run = java command_line KCMIT College BIM program
*/