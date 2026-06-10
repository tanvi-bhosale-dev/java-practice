class DemoWhile
{
	public static void main(String args[])
	{
		int no;
		int sum=0;
		int digit;
		no=Integer.parseInt(args[0]);
		while(no>0)
		{
			digit=no%10;
			sum=sum+digit;
			no=no/10;
		}
		System.out.println("sum of digit="+sum);
	}
}