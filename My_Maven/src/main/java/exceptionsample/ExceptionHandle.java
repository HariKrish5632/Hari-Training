package exceptionsample;

public class ExceptionHandle {
	
	public void add() {
		int a = 50;
		
		try { 
		int b = a/0; //Exception in thread "main" java.lang.ArithmeticException: / by zero
		
		System.out.println(b); // printing smt error due to arthim
	}/*catch (Exception x) {
		System.out.println("Exception Handled");
		System.out.println(x);
	}*/
		finally {
			System.out.println("Finally Block"); 
		}
	}

	public static void main(String[] args) {
		
		ExceptionHandle ob1 = new ExceptionHandle();
		ob1.add();
		System.out.println("End");

	}

}
