package inheritanceInJava;

import java.util.Scanner;

class College
{
	public void college_Name()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the college name:");
		String collegeName =scan.next();
		System.out.println("The college name is: " + collegeName);
		
		//scan.close();
	}
	
}

class Branch extends College
{
	public void branch_Name()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the name of the branch");
		String branchName=scan.next();
		System.out.println("The branch name is: " + branchName);
		
		scan.close();
	}
}

public class SingleLevelInheritanceInJava 
{

	public static void main(String[] args) 
	{
		Branch b=new Branch();
		b.college_Name();
		b.branch_Name();

	}

}
