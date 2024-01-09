package exceptionsample;

public class ExceptionThrowSample {
	
	public void test(int age) throws LicenceException {
		
		if (age<18) {		
			
			throw new LicenceException("Not Eligible");
			
		}else {
			System.out.println("Eligible");
		}
	}
	
	public static void main(String[] args) throws LicenceException {
		ExceptionThrowSample ob = new ExceptionThrowSample();
		ob.test(15);

	}

}