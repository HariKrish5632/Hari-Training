package stringclass;


public class StudentDetails {
	String studentname;
	int rollnumber; 
	static String collegename = "St.Antonys";
			
	public StudentDetails(String x, int y)
	{
		studentname = x;
		rollnumber = y;
	}
	
	public void display()
	{
		System.out.println("Student name :" +studentname);
		System.out.println("Roll Number :" +rollnumber);		
	}
			
	public static void main(String stgs[])
	{
		StudentDetails obj = new StudentDetails("Vinu",5566);
		obj.display();
		StudentDetails obj1 = new StudentDetails("Merin",5577);
		obj1.display();
		System.out.println("College Name :" + obj.collegename);
	}
}


