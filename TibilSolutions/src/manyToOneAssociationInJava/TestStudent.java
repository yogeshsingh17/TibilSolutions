package manyToOneAssociationInJava;

import manyToOneAssociationInJava.Branch;
import manyToOneAssociationInJava.Students;

public class TestStudent 
{

	public static void main(String[] args) 
	{
		Branch b=new Branch();
		b.branchName="Analytics";
		b.branchId=101;
		
		Students s1=new Students();
		s1.setStudentName("Mahima");
		s1.setStudentAge(25);
		s1.setStudentMobileNo(9527884971l);
		s1.setStudentAddress("Pune");
		s1.setBranch(b);
		
		Students s2=new Students();
		s2.setStudentName("Yogesh");
		s2.setStudentAge(26);
		s2.setStudentMobileNo(7011004402l);
		s2.setStudentAddress("Bengaluru");
		s2.setBranch(b);
		
		Students s3=new Students();
		s3.setStudentName("Nitin");
		s3.setStudentAge(22);
		s3.setStudentMobileNo(9066320899l);
		s3.setStudentAddress("Mengaluru");
		s3.setBranch(b);
		
		System.out.println("Students details:");
		System.out.println("*****************");
		System.out.println("Student name: " + s1.getStudentName());
		System.out.println("Student age: " + s1.getStudentAge());
		System.out.println("Stundent Mobile No.: " + s1.getStudentMobileNo());
		System.out.println("Student Address: " + s1.getStudentAddress());
		System.out.println("Student Branch name: " + s1.getBranch().branchName);
		System.out.println("Student Branch Id: " + s1.getBranch().branchId);
		
		System.out.println();
		
		System.out.println("Student name: " + s2.getStudentName());
		System.out.println("Student age: " + s2.getStudentAge());
		System.out.println("Stundent Mobile No.: " + s2.getStudentMobileNo());
		System.out.println("Student Address: " + s2.getStudentAddress());
		System.out.println("Student Branch name: " + s2.getBranch().branchName);
		System.out.println("Student Branch Id: " + s2.getBranch().branchId);
		
		System.out.println();
		
		System.out.println("Student name: " + s3.getStudentName());
		System.out.println("Student age: " + s3.getStudentAge());
		System.out.println("Stundent Mobile No.: " + s3.getStudentMobileNo());
		System.out.println("Student Address: " + s3.getStudentAddress());
		System.out.println("Student Branch name: " + s3.getBranch().branchName);
		System.out.println("Student Branch Id: " + s3.getBranch().branchId);

		
		
		
		
		
	}

}
