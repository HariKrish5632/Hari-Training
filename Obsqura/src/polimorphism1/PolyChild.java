package polimorphism1;

public class PolyChild {
	
	final char j = 'I';
	
	public void print() {
		System.out.println("Child Check");
		//super.print();
		//j = 10;
	}
	

	public static void main(String[] args) {
		
		PolyChild ob = new PolyChild();
		ob.print();
		
		PolyParent ob1 = new PolyParent();
		ob1.print();
		
		

	}

}
