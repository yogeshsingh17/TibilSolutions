package oneToOneAssociationInJava;

import oneToOneAssociationInJava.Account;
import oneToOneAssociationInJava.Employee;

public class EmployeeTest {

	public static void main(String[] args) 
	{
		Account acc=new Account(7001,"Savings","SBI");
		Employee e=new Employee("Yogesh Singh", 201, "Bengaluru", 7011004402l, acc);
		e.getEmployeeDetails();
		
	}

}
