package Interfac;

public class SampleClass2 implements Sample1{
	
	public void display() {
		
		System.out.println("Ab Method1");
	}
	
	public void add() {
		
		System.out.println(a+b);
	}
	
	public void print() {
		
		System.out.println("Child cls method");
	}

	public static void main(String[] args) {
		
		//SampleClass2 ob = new SampleClass2();
		Sample1 ob1= new SampleClass2();
		//InterfasceName ObjectName = new ClassName();
		ob1.display();
		ob1.add();
		//ob1.print();
		System.out.println(ob1.a);
	
		

	}

}
