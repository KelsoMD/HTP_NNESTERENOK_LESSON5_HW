package by.htp.state3;

import java.util.ArrayList;

public class District {
	String name;
	long population;
	static int idCount=1;
	ArrayList<City> cities;
	long square;
	int id;
	
	public District() {
		this.id = idCount;
		idCount++;
		this.name = "New District "+id;
		cities = new ArrayList<City>();
	}
	public District(int x) {
		this.id = idCount;
		idCount++;
		this.name = "New District "+id;
		cities = new ArrayList<City>();
		for(int i=0;i<x;i++) {
			cities.add(new City());
		}
		this.setPopulation();
		this.setSquare();
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
	
	public void setPopulation() {
		long population = 0;
		if (cities != null) {
			for (City ct : cities) {
				if (ct != null) {
					population += ct.population;
				}
			}
		}
		this.population = population;
	}
	
	public ArrayList<City> getCities() {
		return cities;
	}
	public void setCities(ArrayList<City> cities) {
		this.cities = cities;
	}
	public long getSquare() {
		return square;
	}
	public void setSquare() {
		long square = 0;
		if (cities != null) {
			for (City ct : cities) {
				if (ct != null) {
					square += (long) (Math.random()*700000+200000);
				}
			}
		}
		this.square = square;
	}
	public void getInfo() {
		System.out.println("Name: "+this.getName());
		System.out.println("District id "+this.id);
		System.out.println("Population: "+this.population);
		System.out.println("Square: "+this.getSquare());
		for (City ct : cities) {
			System.out.print(ct.name+" ");
		}
	}
}
