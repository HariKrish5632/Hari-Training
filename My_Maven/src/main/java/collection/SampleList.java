package collection;

import java.util.ArrayList;
import java.util.List;

public class SampleList {

	public static void main(String[] args) //N0n-Generic Array List	
	{
		List<Integer> a11=new ArrayList();  // Generic List
		
		a11.add(123);
		//a11.add(123.45f); Can't compile due to generic list is only Integer
		//a11.add("Look");
		//a11.add(456789.123d);
		
		System.out.println(a11);		
		
		//List<Integer>a1=new ArrayList();
		//Predefined_Class_Name<Integer_Data_Type>() Object_Name = new Predefined_Class_Name ;
		
		List a12=new ArrayList();	// Non generic List
		a12.add("COC");
		a12.add('I');
		a12.add(5632);
		a12.add(5632.7896d);
		a12.add(56.32f);
		
		System.out.println(a12);
		
		a12.remove(0);
		
		System.out.println(a12);
		
		//Predefined_Class_Name Object_Name = new Predefined_Class_Name();
		
		
		// ASSIGMnet
		//LinkedList a21 = new LinkedList();
		//Set a31 = new Set();

	}

}
