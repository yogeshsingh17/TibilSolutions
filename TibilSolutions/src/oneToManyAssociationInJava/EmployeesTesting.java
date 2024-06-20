package oneToManyAssociationInJava;

public class EmployeesTesting 
{

	public static void main(String[] args) 
	{
		Employees ee1 = new Employees("Yogesh singh", "Rani mehal", 26, 1001);
		Employees ee2 = new Employees("MS Dhoni", "Mannat mehal", 40, 2001);
		Employees ee3 = new Employees("Sushant singh rajput", "Hava mehal", 30, 3001);
		
		Employees[] emp=new Employees[3];
		emp[0]=ee1;
		emp[1]=ee2;
		emp[2]=ee3;
		
		Department dd=new Department("Cricket", 786, emp);
		dd.display();
	}

}
