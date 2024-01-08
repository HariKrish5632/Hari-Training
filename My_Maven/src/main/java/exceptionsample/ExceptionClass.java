package exceptionsample;

public class ExceptionClass {
	
	public void add() {
		int a = 50;
		int b = a/0; //Exception in thread "main" java.lang.ArithmeticException: / by zero
		
		System.out.println(b); // printing smt error due to arthim
	}

	public static void main(String[] args) {
		
		ExceptionClass ob = new ExceptionClass();
		System.out.println("End of Statement");
		ob.add();
		System.out.println("End of Statement");

	}

}




