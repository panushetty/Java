package com.pranayshetty;
import java.util.*;

public  final class HeavenlyBody {
	private final String name;
	private final double orbintalPeriod;
	private final Set<HeavenlyBody> satellite;
	public HeavenlyBody(String name, double orbintalPeriod) {
		super();
		this.name = name;
		this.orbintalPeriod = orbintalPeriod;
		this.satellite=new HashSet<>();
	}
	public String getName() {
		return name;
	}
	public double getOrbintalPeriod() {
		return orbintalPeriod;
	}
	
	public boolean addMoon(HeavenlyBody moon) {
		return this.satellite.add(moon);
	}
	public Set<HeavenlyBody> getSatellite() {
		return new HashSet<>(this.satellite);
	}
	
	
	@Override
	public int hashCode() {
		System.out.println("hashCode called");
		return this.name.hashCode()+57;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		
		System.out.println("Equals called");
		if(this==obj) {
			return true;
		}
		if (obj==null  || obj.getClass()!=this.getClass()) {
			return false;
		}
		
		String objName=((HeavenlyBody) obj).getName();
		return this.name.equals(objName );
	}
	
	
	

}
