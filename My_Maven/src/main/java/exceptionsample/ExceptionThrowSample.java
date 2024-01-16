package exceptionsample;

public class ExceptionThrowSample {
	
	public void test(int age) throws LicenceException {
		
		if (age<18) {		
			
			throw new LicenceException("Not Eligible");
			
		}else {
			System.out.println("Eligible");
		}
	}
	
	public static void main(String[] args) {
		ExceptionThrowSample ob = new ExceptionThrowSample();
		try {
			ob.test(15);
		} catch (LicenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
