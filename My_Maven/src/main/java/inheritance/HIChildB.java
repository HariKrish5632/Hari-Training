package inheritance;

public class HIChildB extends HirerachicalInheritance {
	
	char z ='C';
	
	public void add1()
	{
		System.out.println(x+" "+z);
	}

	public static void main(String[] args) {
		HIChildB ob = new HIChildB();
		ob.print();
		ob.add1();

	}

}