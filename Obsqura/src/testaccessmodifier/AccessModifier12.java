package testaccessmodifier;

public class AccessModifier12 extends AccessModifier11{
	
	public static void main(String[] args) {
		AccessModifier11.one();
		//AccessModifier11.two();  //private	
		AccessModifier11.three();
		AccessModifier11.four();
		
		AccessModifier12 obj1 = new AccessModifier12();
		
		System.out.println(obj1.a);
		//System.out.println(obj1.b);	//private	
		System.out.println(obj1.c);
		System.out.println(obj1.d);
				
	}

}
