package inheritanceInJava;

class Car
{
		String engineType="V12";		
		String engineFuelType="Petrol";
}

class Customer extends Car
{
		int noOfSeatInCar=2;
		int topSpeedRequired=300;
}



public class InheritanceInJava 
{

	public static void main(String[] args) 
	{
		Customer c=new Customer();
		System.out.println(c.engineType);
		System.out.println(c.engineFuelType);
		System.out.println(c.noOfSeatInCar);
		System.out.println(c.topSpeedRequired);

	}

}
