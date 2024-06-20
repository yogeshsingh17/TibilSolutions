package staticKeywordInJava;

class staticVariable
{
	String name;
	static int age=25;
	static String schoolName= "Kendriya Vidyalaya";
	
	staticVariable(String name)
	{
		this.name=name;
	}
	
	public void display()
	{
		System.out.println(name + " " + age + " " + schoolName);
	}
}

public class StaticVariableInJava 
{

	public static void main(String[] args) 
	{
		staticVariable sv1= new staticVariable("Ankit");
		staticVariable sv2= new staticVariable("Mahima");
		staticVariable sv3= new staticVariable("Samaira");
		staticVariable sv4= new staticVariable("Nitin");
		staticVariable sv5= new staticVariable("Pranshi");
		
		sv1.display();
		sv2.display();
		sv3.display();
		sv4.display();
		sv5.display();
		
		
	}

}
