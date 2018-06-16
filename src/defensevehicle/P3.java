/**
 * Copyright © 2018
 * Steven Anderson
 * All rights reserved
 * 
 * Homework 4 - Defense Vehicles
 * P3.java - Aircraft object that contains engines field  
 * 06/20/2018
 */

package defensevehicle;

public class P3 extends Aircraft {
	private static final int DEFAULT_LENGTH = 36;
	private static final int DEFAULT_NUMBER_OF_ENGINES = 4;
	private static final String DEFAULT_NAME = "Lockheed P-3 Orion";
	
	public P3(String type) {
		super(DEFAULT_LENGTH, DEFAULT_NAME, type);
		setNumberEngines(DEFAULT_NUMBER_OF_ENGINES);
	}
	
	public P3(int speed, String type, int altitude) {
		this(DEFAULT_LENGTH, speed, DEFAULT_NAME, type, altitude, DEFAULT_NUMBER_OF_ENGINES);
	}
	
	private P3(int length, int speed, String name, String type, int altitude, int numberEngines) {
		super(length, speed, name, type, altitude);
		setNumberEngines(numberEngines);
	}

	private int numberEngines;

	public int getNumberEngines() {
		return numberEngines;
	}

	public void setNumberEngines(int numberEngines) {
		this.numberEngines = numberEngines;
	}
	
	@Override
	public String toString() {
		String formattedDetails = String.format("P3 Aircraft | Engines: %d | %s ", getNumberEngines(), super.toString());
		return formattedDetails;
	}
}
