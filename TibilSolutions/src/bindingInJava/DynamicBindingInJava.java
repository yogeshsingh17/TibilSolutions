package bindingInJava;

class Parent
{
	public void parent()
	{
		System.out.println("This is the parent class");
	}
	
}

class Child extends Parent
{
	@Override
	public void parent()
	{
		System.out.println("This is child class");
	}
}

public class DynamicBindingInJava 
{

	public static void main(String[] args) 
	{
			Parent p=new Parent();
			p.parent();
			
			Parent c=new Child();
			c.parent();

	}

}