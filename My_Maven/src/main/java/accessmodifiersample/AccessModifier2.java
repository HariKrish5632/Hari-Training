package accessmodifiersample;

public class AccessModifier2 extends AccessModifier1 {

	public static void main(String[] args) {
		AccessModifier1.add();
				
		AccessModifier2 ob1 = new AccessModifier2();
		System.out.println(ob1.a);
		//ob1.print(); // its private can't visible in other class
		//System.out.println(ob1.x);// its private can't visible in other class
		
		System.out.println(ob1.i);
		System.out.println(ob1.q);	
		

	}

}
