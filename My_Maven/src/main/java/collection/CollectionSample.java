package collection;

import java.util.ArrayList;

import java.util.Iterator;

public class CollectionSample {

	public static void main(String[] args) //N0n-Generic Array List	
	{
		
		ArrayList a1 = new ArrayList();
		a1.add("Hello");
		a1.add('H');
		a1.add(123);
		a1.add(1237.456d);
		a1.add(12.56f);
		
		System.out.println(a1);
		
		ArrayList<String> a2 = new ArrayList();//Generic Array List
		
		a2.add("World");
		a2.add("Good");
		a2.add("Day");
		a2.add("Welcome");
		a2.add("You");
		//a2.add(45);   // Can't compile due to generic array list is only String
		//a2.add(5556.456d);
		//a2.add('K');
		
		System.out.println(a2);
		
		a2.remove(2); // to remove a particular value
		
		System.out.println(a2);
		
		ArrayList<String> a3 = new ArrayList();
		a3.add("Hyreo");
		a3.add("Thoughts");
		a3.add("Arena");
		a2.addAll(a3);
		System.out.println(a2);
		
		//removeAll
		a1.removeAll(a1);
		System.out.println(a1);
		
		//get
		System.out.println(a2.get(1));
		
		//size
		System.out.println(a2.size());
		
		//contains
		boolean x = a3.contains("Hyreo");//True check
		System.out.println(x);
		
		boolean y = a3.contains("Hitachi");//False check
		System.out.println(y);
		
		//Iterator
		
		Iterator itr = a3.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// iteration remove
		itr.remove(); // to remove last element
		System.out.println(a3);
		
		}

}
