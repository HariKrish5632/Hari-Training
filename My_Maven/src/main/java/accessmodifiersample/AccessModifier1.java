package accessmodifiersample;

public class AccessModifier1 {
	public int a = 10; //Public variable
	private char x = 'H';	//Private Variable
	protected String i ="Jaison";	//Protected variable
	int q = 1001; // default variable
		
	 public static void add() {
		 int b = 20;
		 int c = 30;
		 System.out.println(b+c);
	 }
	 
	 private static void print() {
			System.out.println("Check");
	 }
	 
	 protected static void display(){
		 System.out.println("Protected");
	 }
	 
	static void check() {
		 System.out.println("default method");
	 } 

	public static void main(String[] args) {
		AccessModifier1.add();
		AccessModifier1 ob = new AccessModifier1();
		System.out.println(ob.a);
		System.out.println(ob.x);
		ob.print();
		System.out.println(ob.i);
		ob.display();
		System.out.println(ob.q);
		ob.check();

	}

}
