class TypeCasting
{
	public static void main(String args[])
	{
		int x = 100;
		double y = x;

		System.out.println("Implicit Casting:");
		System.out.println(y);

		double a = 99.99;
		int b = (int)a;

		System.out.println("Explicit Casting:");
		System.out.println(b);
	}
}