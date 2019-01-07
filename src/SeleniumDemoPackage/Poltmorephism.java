package SeleniumDemoPackage;

public class Poltmorephism {

	public void multi(int i, int a) {
		for (i=1; i<=10; i++)
		{
			System.out.println(i+"*2="+i*a);
		}
	}
		public void multi(int j, int k, int l)
		{
			for (j=1; j<=10; j++)
			{
				System.out.println(j+"*2="+j*k);
				System.out.println(j+"*5="+j*l);
			}
		}
		public static void main(String args[])
		{
			Poltmorephism obj= new Poltmorephism();
			obj.multi(1,2);
			obj.multi(1,2,5);
		}
	}
