package stringclass;

public class stringBufferClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer ob = new StringBuffer("Hello");
		System.out.println(ob);	
		
		//append
		ob.append("World");//object_name.append(object);
		System.out.println(ob);
		
		
		//insert
		ob.insert(5, "Hi" );//object_name.insert(on which index the character need to insert, object);
		System.out.println(ob);
	
		//replace
		ob.replace(7, 12, "Everyone");//object_name.replace(index of 1st character -1 to replace, index of last character to replcae, object);
		System.out.println(ob);
		
		//delete
		ob.delete(5, 7);//object_name.replace(index of 1st character -1 to delete, index of last character to delete, object);
		System.out.println(ob);
		
		//reverse
		ob.reverse();//object_name.reverse();
		System.out.println(ob);
		
	}
}

