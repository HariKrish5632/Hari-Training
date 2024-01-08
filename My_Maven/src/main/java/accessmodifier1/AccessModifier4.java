package accessmodifier1;

import accessmodifiersample.AccessModifier1;//

public class AccessModifier4 {

	public static void main(String[] args) {
		AccessModifier1.add();
		AccessModifier1 ob3 = new AccessModifier1();//aggregation - we can create a object of previous class to new class
		System.out.println(ob3.a);
		//ob3.print();// not visible from due to its Private 
		//System.out.println(ob3.i);// not 
		
	}

}
