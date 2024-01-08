package stringclass;

public class stringBuilderClass {

	public static void main(String[] args) {
		StringBuilder ob = new StringBuilder("Good");
		System.out.println(ob);	
		
		//append
		ob.append("Work");//object_name.append(object);
		System.out.println(ob);
		
		//insert
		ob.insert(8, "Team" );//object_name.insert(on which index the character need to insert, object);
		System.out.println(ob);
	
		//replace
		ob.replace(4, 8, "Task");//object_name.replace(index of 1st character -1 to replace, index of last character to replcae, object);
		System.out.println(ob);
		
		//delete
		ob.delete(4, 8);//object_name.replace(index of 1st character -1 to delete, index of last character to delete, object);
		System.out.println(ob);
		
		//reverse
		ob.reverse();//object_name.reverse();
		System.out.println(ob);
	}
		
	}
		

	
