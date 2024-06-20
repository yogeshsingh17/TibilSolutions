package constructorInJava;

class ConstructorInJava
{
	String name;
	int age;
	String city;
	
	ConstructorInJava(String name,int age,String city)
	{
		this.name=name;
		this.age=age;
		this.city=city;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getCity()
	{
		return city;
	}
	
	
}

public class Constructor1 
{

	public static void main(String[] args) 
	{
		ConstructorInJava a= new ConstructorInJava("Yogesh",26,"Bengaluru");
		
		System.out.println(a.getName());
		System.out.println(a.getAge());
		System.out.println(a.getCity());
	}

}
