package inheritance;

public class HIChildA extends HirerachicalInheritance {
	
	char y ='B';
	
	public void add()
	{
		System.out.println(x+" "+y);
	}

	public static void main(String[] args) {
		HIChildA ob = new HIChildA();
		ob.print();
		ob.add();

	}

}
