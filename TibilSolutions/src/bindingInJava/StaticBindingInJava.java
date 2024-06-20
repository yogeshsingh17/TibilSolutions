package bindingInJava;

class HeadMaster
{
	public static void student()
	{
		System.out.println("This is the Head master method");
	}
	
}

class Student extends HeadMaster
{
	public static void student()
	{
		System.out.println("This is Student method");
	}
}

public class StaticBindingInJava 
{

	public static void main(String[] args) 
	{
		HeadMaster hm=new HeadMaster();
		HeadMaster.student();
		
		HeadMaster stu=new Student();
		HeadMaster.student();
		
		

	}

}
