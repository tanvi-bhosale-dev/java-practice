class DemoIf
{
	public static void main(String args[])
	{
		int age = 22;
		int citizen = 1;
		
		System.out.println("Checking Eligibility...");
			
		if(age >= 18)
		{
			System.out.println("Age condition satisfied");

			if(citizen == 1)
			{	
				System.out.println("Eligible for Voting");
			}
		}
		System.out.println("Program Ended");
	}
}