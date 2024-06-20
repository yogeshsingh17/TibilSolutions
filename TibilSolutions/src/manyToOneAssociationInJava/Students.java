package manyToOneAssociationInJava;

public class Students 
{
	String studentName;
	int studentAge;
	long studentMobileNo;
	String studentAddress;
	
	Branch branch;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public long getStudentMobileNo() {
		return studentMobileNo;
	}

	public void setStudentMobileNo(long studentMobileNo) {
		this.studentMobileNo = studentMobileNo;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	
}
