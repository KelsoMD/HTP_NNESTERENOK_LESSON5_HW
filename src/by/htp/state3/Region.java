package by.htp.state3;

import java.util.ArrayList;

public class Region {
	String name;
	long population;
	static int idCount=1;
	ArrayList<District> districts;
	long square;
	int id;
	
	public Region() {
		this.id = idCount;
		idCount++;
		this.name = "New Region "+id;
		districts = new ArrayList<District>();
	}
	public Region(int x) {
		this.id = idCount;
		idCount++;
		this.name = "New Region "+id;
		districts = new ArrayList<District>();
		for(int i=0;i<x;i++) {
			districts.add(new District(x));
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
		if (districts != null) {
			for (District ct : districts) {
				if (ct != null) {
					population += ct.population;
				}
			}
		}
		this.population = population;
	}
	
	public ArrayList<District> getCities() {
		return districts;
	}
	public void setCities(ArrayList<District> districts) {
		this.districts = districts;
	}
	public long getSquare() {
		return square;
	}
	public void setSquare() {
		long square = 0;
		if (districts != null) {
			for (District ct : districts) {
				if (ct != null) {
					square += ct.square;
				}
			}
		}
		this.square = square;
	}
	public void getInfo() {
		System.out.println("Name: "+this.getName());
		System.out.println("Region id "+this.id);
		System.out.println("Population: "+this.population);
		System.out.println("Square: "+this.getSquare());
		for (District ct : districts) {
			System.out.print(ct.name+" ");
		}
	}
}
