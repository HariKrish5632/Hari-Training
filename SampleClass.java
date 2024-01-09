package abstractsample;

public class SampleClass extends SampleAbstract{
	
	public void print() {
		System.out.println("Abstract Method");
		
	}

	public static void main(String[] args) {
		SampleClass ob = new SampleClass();
		ob.print();
		ob.display();
		
	}

}
