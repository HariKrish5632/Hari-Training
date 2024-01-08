package constructorprogramm;
/*Write a program to find the grade of 2 students based on total marks(3 subjects) • 
 * Get the student's marks from the constructor •
 * Return the total mark to in main method • Find the grade of each student. */

public class StudentReturnStudentMark {
	
	    String name;
	    int subject1;
	    int subject2;
	    int subject3;

	    public StudentReturnStudentMark(String name, int subject1, int subject2, int subject3) {
	        this.name = name;
	        this.subject1 = subject1;
	        this.subject2 = subject2;
	        this.subject3 = subject3;
	        	    }

	        public int calculateTotalMarks() {
	        	int total = subject1+subject2+subject3;
		        return total;
	    }
	        
	    
	    public static void main(String[] args) {
	        
	    	StudentReturnStudentMark sob1 = new StudentReturnStudentMark("John Doe", 85, 90, 78);
	    	System.out.println(sob1.calculateTotalMarks());
	        StudentReturnStudentMark sob2 = new StudentReturnStudentMark("Jane Doe", 92, 88, 75);
	        System.out.println(sob2.calculateTotalMarks());
	        StudentReturnStudentMark sob3 = new StudentReturnStudentMark("Jais Doe", 95, 77, 85);
	        System.out.println(sob3.calculateTotalMarks());
	     
	    }
}
	        
