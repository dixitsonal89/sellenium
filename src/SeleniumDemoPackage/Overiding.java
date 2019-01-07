package SeleniumDemoPackage;

class Father {
	public void name () {
		System.out.println("Girish");
	}
}
class Son extends Father
{
	public void name()
	{
		System.out.println("Gaurav");
	}
}
class Grandson extends Son
{
	public void name()
	{
		System.out.println("Navam");
	}
}
class Overiding {
	public static void main(String args[])
	{
		Father obj1= new Father();
		Father obj2= new Son();
		Father obj3= new Grandson();
		obj1.name();
		obj2.name();
		obj3.name();

	}

}
