class break_as_goto
{
	public static void main(String[] args) {
		boolean b =true;
		first:
		{
			second:
			{
				third:
				{
					System.out.println("Before break");
					if(b)
						break third;
					System.out.println("This won't execute");
				}
				System.out.println("This won't execute");
			}
			System.out.println("Out of second level");
		}
	}
}