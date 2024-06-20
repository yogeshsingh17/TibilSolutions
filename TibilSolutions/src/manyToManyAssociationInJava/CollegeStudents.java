package manyToManyAssociationInJava;

public class CollegeStudents 
{
	String sName;
	int sAge;
	long sMobileNo;
	String sAdd;
	
	CollegeCourses [] cCourse;

	public CollegeStudents(String sName, int sAge, long sMobileNo, String sAdd, CollegeCourses[] cCourse) 
	{
		super();
		this.sName = sName;
		this.sAge = sAge;
		this.sMobileNo = sMobileNo;
		this.sAdd = sAdd;
		this.cCourse = cCourse;
	}
	
	public void getStudentDetails()
	{
		System.out.println("Student details are as follows: ");
		System.out.println("*******************************");
		
		System.out.println("Student name is: " + sName);
		System.out.println("Studnet age is: " + sAge);
		System.out.println("Student mobile No. is: " + sMobileNo);
		System.out.println("Student address is: " + sAdd);
		for(CollegeCourses cc: cCourse)
		{
			System.out.println("Student college Course name is: " + cc.courseName);
			System.out.println("Student college course Id is: " + cc.courseId);
		}
	}
	
	
}
