package abstractcheck;

public class Abstract2 extends Abstract1{
	
	public void details(String name, int age){
		System.out.println(name);
		System.out.println(age);
		
	}
	public static void main(String[] args) {
		
		Abstract2 ob = new Abstract2();
		ob.details("MAHI", 20);
		
		
	}
	@Override
	public void details() {
		// TODO Auto-generated method stub
		
	}
}