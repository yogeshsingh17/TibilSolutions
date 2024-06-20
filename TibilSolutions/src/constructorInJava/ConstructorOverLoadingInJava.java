package constructorInJava;

class ConstructorOverloading
{
	String name;
	int age;
	static String city="Bengaluru";
	
	ConstructorOverloading()
	{
		name="Mahima";
		age=26;
	}
	
	ConstructorOverloading(String name)
	{
		this.name=name;
	}
	
	ConstructorOverloading(int age)
	{
		this.age=age;
	}
	
	ConstructorOverloading(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	public void display()
	{
		System.out.println(name + " " + age + " " + city);
	}
	
}

public class ConstructorOverLoadingInJava 
{

	public static void main(String[] args) 
	{
		ConstructorOverloading co= new ConstructorOverloading();
		
		ConstructorOverloading co1= new ConstructorOverloading("Nitin");
		
		ConstructorOverloading co2= new ConstructorOverloading(21);
		
		ConstructorOverloading co3= new ConstructorOverloading("Ankit",26);
		
		co.display();
		co1.display();
		co2.display();
		co3.display();

	}

}
