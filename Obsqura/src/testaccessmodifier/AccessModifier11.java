package testaccessmodifier;

public class AccessModifier11 {
	
	public char a = 'H';	//Public Variable
	private char b = 'A';	//Private Variable
	protected char c = 'R';	//Protected Variable
	char d = 'I';			//Default Variable
	
	public static void one() {
		System.out.println("Public Method");
	}
	
	private static void two() {
		System.out.println("Private Method");		
	}
	
	protected static void three() {
		System.out.println("Protected Method");		
	}
	
	static void four() {
		System.out.println("Default Method");		//Default method
	}
	
	public static void main(String[] args) {
		AccessModifier11 obj= new AccessModifier11();
		obj.one();
		obj.two();
		obj.three();
		obj.four();
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
	}

}
