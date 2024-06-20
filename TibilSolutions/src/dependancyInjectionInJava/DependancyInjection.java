package dependancyInjectionInJava;

class Address
{
	String city,state,country;
	
	public Address(String city,String state,String country)
	{
		this.city=city;
		this.state=state;
		this.country=country;
	}
	
}

class Employee
{
	int empId;
	String name;
	int age;
	long mobileNo;
	
	Address address;		//Dependency Injection
	
	public Employee(String name,int empId,int age,long mobileNo, Address address)
	{
		this.name=name;
		this.empId=empId;
		this.age=age;
		this.mobileNo=mobileNo;
		this.address=address;
	}
	
	public void display()
	{
		System.out.println(name + "  " + empId + "  " + age + "  " + mobileNo);
		System.out.println(address.city + address.state + address.country);
	}
}

public class DependancyInjection 
{

	public static void main(String[] args) 
	{
		Address a=new Address("Pune","Maharashtra","India");
		
		Employee e=new Employee("Ankit",101,26,7011004402l,a);
		
		e.display();

	}

}
