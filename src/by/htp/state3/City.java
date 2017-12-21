package by.htp.state3;

public class City {
	String name;
	long population;
	static int idCount=1;
	private int id;
	
	public City() {
		this.id = idCount;
		idCount++;
		this.name = "New city id "+id;
		this.population = (long)(Math.random()*1500000+500000);
	}
	public City(String name, long population) {
		this.id = idCount;
		idCount++;
		this.name = name;
		this.population = population;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	public int getId() {
		return this.id;
	}
	public void getInfo() {
		System.out.println("Name: "+this.getName());
		System.out.println("City id "+this.id);
		System.out.println("Population: "+this.population);
	}
	
}
