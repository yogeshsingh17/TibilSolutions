package dependancyInjectionInJava;

import java.util.*;

class Address1
{
	String city,state,country;
	
	public Address1(String city,String state,String country)
	{
		this.city=city;
		this.state=state;
		this.country=country;
	}
	
}

class Employee1
{
	int empId;
	String name;
	int age;
	long mobileNo;
	
	Address1 address1;		//Dependency injection
	
	public Employee1(String name,int empId,int age,long mobileNo, Address1 address1)
	{
		this.name=name;
		this.empId=empId;
		this.age=age;
		this.mobileNo=mobileNo;
		this.address1=address1;
	}
	
	public void display()
	{
		System.out.println(name + "  " + empId + "  " + age + "  " + mobileNo);
		System.out.println(address1.city + "  " + address1.state + "  " + address1.country);
	}
}

public class DependancyInjection1 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the address of the employee:");
		
		System.out.println("City: ");
		String city=scan.nextLine();
		
		System.out.println("State:");
		String state=scan.nextLine();
		
		System.out.println("Country:");
		String country=scan.nextLine();
		
		
		System.out.println();
		
		System.out.println("Enter the employee details: ");
		
		System.out.println("Employee name:");
		String name=scan.nextLine();
		
		System.out.println("Employee id: ");
		int empId=scan.nextInt();
		
		System.out.println("Employee age: ");
		int age=scan.nextInt();
		
		System.out.println("Employee mobile number: ");
		long mobileNo=scan.nextLong();
		
		Address1 ad=new Address1(city,state,country);
		
		Employee1 emp=new Employee1(name,empId,age,mobileNo,ad);
		
		emp.display();
		
		

	}

}
