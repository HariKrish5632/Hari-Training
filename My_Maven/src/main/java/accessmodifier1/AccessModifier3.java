package accessmodifier1;

import accessmodifiersample.AccessModifier1; 
//import from Package_name.Class_Name

public class AccessModifier3 extends AccessModifier1//subclass
{

	public static void main(String[] args) {
		AccessModifier3.add();
		AccessModifier3 ob2 = new AccessModifier3();
		System.out.println(ob2.a);
		//ob2.print(); // its private can't visible in other class
		
		System.out.println(ob2.i);

	}

}
