package oneToManyAssociationInJava;

public class Department 
{
	String departmentName;
	int departmentId;
	
	public Employees [] employees;
	
	public Department(String departmentName, int departmentId, Employees[] employees) {
		super();
		this.departmentName = departmentName;
		this.departmentId = departmentId;
		this.employees = employees;
	}



	public void display()
	{
		System.out.println("Department details:");
		
		System.out.println("Department name: " + departmentName);
		System.out.println("Department Id: " + departmentId);
		
		System.out.println();
		
		System.out.println("Employee details: " );
		
		for(Employees emp: employees)
		{
			System.out.println("Employee name: " + emp.empName);
			System.out.println("Employee age: " + emp.empAge);
			System.out.println("Employee id: " + emp.empId);
			System.out.println("Employee address: " + emp.empAdd);
			System.out.println();
		}
	}
	
}
