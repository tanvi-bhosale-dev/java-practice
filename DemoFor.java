class DemoFor
{
	public static void main(String args[])
	{
		int num = 7;
		System.out.println("Table of " +num);
		
		for(int i =1;i<=10;i++)
		{
			System.out.println(num+"X"+i+"="+(num * i));
		}
		System.out.println("Table Completed");
	}
}