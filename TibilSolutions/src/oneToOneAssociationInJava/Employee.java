package oneToOneAssociationInJava;

public class Employee 
{
	String empName;
	int empId;
	String empAddress;
	long empMobileNo;
	
	Account account;

	public Employee(String empName, int empId, String empAddress, long empMobileNo, Account account) 
	{
		super();
		this.empName = empName;
		this.empId = empId;
		this.empAddress = empAddress;
		this.empMobileNo=empMobileNo;
		this.account = account;
	}

	public void getEmployeeDetails()
	{
		System.out.println("The employee details are as follows:");
		
		System.out.println("Name of the employee: " + empName);
		System.out.println("ID of the employee: " + empId);
		System.out.println("Address of the employee: " + empAddress);
		System.out.println("Mobile number of the employee: " + empMobileNo);
		
		System.out.println("The account details of the employee are as follows: ");
		System.out.println("The account number of the employee is: " + account.accNo);
		System.out.println("The account type of the employee is: " + account.accType);
		System.out.println("The bank name in which account exists is: " + account.bankName);
		
	}
	
	
	
}
