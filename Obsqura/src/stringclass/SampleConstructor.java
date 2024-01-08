package stringclass;

public class SampleConstructor
{
	public SampleConstructor() //default constructor
	{
		String a = "Hari";
		System.out.println(a);
	}
	public SampleConstructor(String i, float j)//Parameterised constructor
	{
		System.out.println(i+"-"+j);
	}
	/*public SampleConstructor()
	{
		System.out.println("Default Default");
	}*/
	public SampleConstructor(int a, int b)
	{
		System.out.println(a+b);
	}
	public static void main (String args[])
	{
		SampleConstructor obj = new SampleConstructor();
		SampleConstructor obj1 = new SampleConstructor("Strong", 12.56f);
		SampleConstructor obj2 = new SampleConstructor();
		SampleConstructor obj3 = new SampleConstructor(50,75);
	}
}