class Employee
{
	static String Cname;
	String ename;
	void getEmployee(int sal)
	{
	System.out.println("company = "+Cname);
	System.out.println("name = "+ename);
	System.out.println("Salary = "+sal);
	}
}
class DemoVariable
{
	public static void main(String args[])
	{
		Employee.Cname="wipro";
		Employee e1=new Employee();
		e1.ename="John";
		Employee e2=new Employee();
		e2.ename="Peter";
		e1.getEmployee(23000);
		e2.getEmployee(45000);
	}
}