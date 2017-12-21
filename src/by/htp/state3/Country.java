package by.htp.state3;

import java.util.ArrayList;

public class Country {
	String name;
	long population;
	ArrayList<Region> districts;
	long square;
	
	public Country() {
		this.name = "New Country";
		districts = new ArrayList<Region>();
	}
	public Country(int x) {
		this.name = "New Country";
		districts = new ArrayList<Region>();
		for(int i=0;i<x;i++) {
			districts.add(new Region(x));
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
			for (Region ct : districts) {
				if (ct != null) {
					population += ct.population;
				}
			}
		}
		this.population = population;
	}
	
	public ArrayList<Region> getCities() {
		return districts;
	}
	public void setRegions(ArrayList<Region> districts) {
		this.districts = districts;
	}
	public long getSquare() {
		return square;
	}
	public void setSquare() {
		long square = 0;
		if (districts != null) {
			for (Region ct : districts) {
				if (ct != null) {
					square += ct.square;
				}
			}
		}
		this.square = square;
	}
	public void getInfo() {
		System.out.println("Name: "+this.getName());
		System.out.println("Number of regions: "+this.districts.size());
		System.out.println("Population: "+this.population);
		System.out.println("Square: "+this.getSquare());
		System.out.println("Regions:");
		int count=1;
		for (Region ct : districts) {
			System.out.print(count+": "+ct.name+" ");
			count++;
		}
	}
}
