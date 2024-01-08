package polymorphism;

public class PolySampleChildClass extends PolySampleParentClass {

	final int b = 60;
	
	@Override 
	//this annotation is used to identify where the override is happening
	public void display() {
		System.out.println("Child Class");
		super.display(); // to print parent class method
		b = 70; // can't change the value due to final keyword variable can't be assigned again
	}
	
	public static void main(String[] args) {
		
		PolySampleChildClass obj = new PolySampleChildClass();
		obj.display();
		PolySampleParentClass obj1 = new PolySampleParentClass();
		// to print parent class method
		obj1.display();
		
	}

}
