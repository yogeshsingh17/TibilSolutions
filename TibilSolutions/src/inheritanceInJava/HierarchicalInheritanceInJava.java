package inheritanceInJava;

class Science
{
	public void science()
	{
		System.out.println("The total no. of subjects in science stream is 5");
	}
}

class Maths extends Science
{
	public void maths()
	{
		System.out.println("Maths is a subject in science stream");
	}
}

class Physics extends Science
{
	public void physics()
	{
		System.out.println("Physics is a subject in science stream");
	}
}

class ComputerScience extends Science
{
	public void computerScience()
	{
		System.out.println("Computer science is a subject in science stream");
	}
}

public class HierarchicalInheritanceInJava 
{

	public static void main(String[] args) 
	{
		Maths m=new Maths();
		m.science();
		m.maths();
		
		Physics p=new Physics();
		p.science();
		p.physics();
		
		ComputerScience cs=new ComputerScience();
		cs.science();
		cs.computerScience();
	}

}
