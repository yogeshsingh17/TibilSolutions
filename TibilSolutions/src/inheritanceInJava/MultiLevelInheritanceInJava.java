package inheritanceInJava;

import java.util.Scanner;

class Universe
{
	public void universe()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the name of the galaxy you live in: ");
		String galaxyName=scan.nextLine();
		System.out.println("The name of the galaxy you live in is: " + galaxyName);
	}
	
}

class Planet extends Universe
{
	public void planet()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the name of the planet you live in: ");
		String planetName=scan.nextLine();
		System.out.println("The name of the planet you live in is: " + planetName);
	}
}

class Continent extends Planet
{
	public void continent()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the name of the continent you live in: ");
		String continentName=scan.nextLine();
		System.out.println("The name of the planet you live in is: " + continentName);
	}
}

class Country extends Continent
{
	public void country()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the name of the country you live in: ");
		String countryName=scan.nextLine();
		System.out.println("The name of the planet you live in is: " + countryName);
	}
}

public class MultiLevelInheritanceInJava 
{

	public static void main(String[] args) 
	{
		Country c=new Country();
		c.universe();
		c.planet();
		c.continent();
		c.country();

	}

}
