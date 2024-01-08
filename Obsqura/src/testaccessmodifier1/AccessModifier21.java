package testaccessmodifier1;

import testaccessmodifier.AccessModifier11;

public class AccessModifier21 extends AccessModifier11 {

	public static void main(String[] args) {
		AccessModifier21.one();
		//AccessModifier21.two();	//private
		AccessModifier21.three();
		//AccessModifier21.four();	//default
		
		AccessModifier21 obj2 = new AccessModifier21();
		
		System.out.println(obj2.a);
		//System.out.println(obj2.b);	//private	
		System.out.println(obj2.c);
		//System.out.println(obj2.d);	//default

	}

}
