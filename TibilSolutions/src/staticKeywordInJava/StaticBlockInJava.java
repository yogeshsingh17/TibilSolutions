package staticKeywordInJava;

class StaticBlock
{
	static int a=10;
	static int b;
	
	static
	{
		b=a*5;
	}
	
	public void display()
	{
		System.out.println("Value of a: " + a);
		System.out.println("Value of b: " + b);
	}
}

public class StaticBlockInJava 
{

	public static void main(String[] args) 
	{
		StaticBlock sb=new StaticBlock();
		sb.display();

	}

}
