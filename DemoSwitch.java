class DemoSwitch
{
	public static void main(String args[])
	{
		int no;
		no=Integer.parseInt(args[0]);
		switch(no)
		{
			case 1: System.out.println("One");
				break;
			case 2: System.out.println("Two");
				break;
			case 3: System.out.println("Three");
				break;
			case 4: System.out.println("Four");
				break;
			default : System.out.println("Invalid Input");
		}
	}
}