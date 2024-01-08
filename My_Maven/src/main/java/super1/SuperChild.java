package super1;

public class SuperChild extends SuperParent{

 
		
		public void display() {
			System.out.println("Super Child");
			System.out.println(super.a);
			System.out.println(super.b);
			super.print();// calling parent method
		}
		public static void main(String[] args) {
			SuperChild ob = new SuperChild();//child object instantiation 
			ob.print();
			ob.display();
			
			SuperParent ob1 = new SuperParent(); //parent object instantiation
			ob1.print(); 
			//ob1.display();
	}

}
