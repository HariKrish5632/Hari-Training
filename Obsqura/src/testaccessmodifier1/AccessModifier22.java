package testaccessmodifier1;

import testaccessmodifier.AccessModifier11;

public class AccessModifier22 {

	public static void main(String[] args) {
			AccessModifier11.one();
			//AccessModifier22.two();	//private
			//AccessModifier22.three();	//Protected
			//AccessModifier22.four();	//default
			
			AccessModifier11 obj3 = new AccessModifier11();
			
			System.out.println(obj3.a);
			//System.out.println(obj3.b);	//private	
			//System.out.println(obj3.c);	//Protected
			//System.out.println(obj3.d);	//default


	}

}
