package manyToManyAssociationInJava;

public class StudentMainMethod 
{

	public static void main(String[] args) 
	{
		CollegeCourses c1 = new CollegeCourses("Back-end dev", 201);
		CollegeCourses c2 = new CollegeCourses("Front-end dev", 202);
		CollegeCourses c3 = new CollegeCourses("Full-stack dev", 203);
		
		CollegeCourses [] course=new CollegeCourses[3];
		course[0]=c1;
		course[1]=c2;
		course[2]=c3;
		
		CollegeStudents cs=new CollegeStudents("Yogesh", 26, 7011004402l, "Patna", course);
		CollegeStudents cs1=new CollegeStudents("Ankit", 25, 9145278991l, "Palam", course);
		CollegeStudents cs2=new CollegeStudents("Mahima", 26, 9920237968l, "Palghar", course);
		CollegeStudents cs3=new CollegeStudents("Sonal", 25, 9066320899l, "Pehalgam", course);
		
		cs.getStudentDetails();
		cs1.getStudentDetails();
		cs2.getStudentDetails();
		cs3.getStudentDetails();

	}

}
