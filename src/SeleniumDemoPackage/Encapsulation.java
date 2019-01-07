package SeleniumDemoPackage;

 class EncapsulationDemo {
	private int empsal;
	private String empname;
	public int emp_sal() {
		return empsal;
	}
	public String emp_Name()
	{
		return empname;
	}
	public int getemp_sal(int sal)
	{
		return empsal=sal;
	}
	public String getemp_Name(String name)
	{
		return empname=name;
	}
}
class Encapsulation {
	public static void main(String args[])
	{
		EncapsulationDemo obj= new EncapsulationDemo();
		obj.getemp_sal(50000);
		obj.getemp_Name("RAM");
		int a= obj.emp_sal();
		String b= obj.emp_Name();
		System.out.println(a);
		System.out.println(b);

	}
	
	
}
