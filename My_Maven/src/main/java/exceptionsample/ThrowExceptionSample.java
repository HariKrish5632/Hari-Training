package exceptionsample;

public class ThrowExceptionSample {
	
	public static void test(int age){
		
		if (age<18) {
			//System.out.println("Not Eligible to Vote");
			throw new ArithmeticException ("Not Eligible to Vote");
			
			
		}else {
			System.out.println("Eligible to Vote");
		}
	}

	public static void main(String[] args) {
		ThrowExceptionSample.test(15);

	}

}
