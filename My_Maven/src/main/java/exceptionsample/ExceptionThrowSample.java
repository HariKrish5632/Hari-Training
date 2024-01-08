package exceptionsample;

public class ExceptionThrowSample throws LicenceException{
	
	public void test(int age) {
		
		if (age<18) {		
			
			throw new LicenceException("Not Eligible");
			
		}else {
			System.out.println("Eligible");
		}
	}
	
	public static void main(String[] args) {
		ExceptionThrowSample ob = new ExceptionThrowSample();
		ob.test(15);

	}

}
