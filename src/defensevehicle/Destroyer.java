/**
 * Copyright © 2018
 * Steven Anderson
 * All rights reserved
 * 
 * Homework 4 - Defense Vehicles
 * Destroyer.java - Ship object that contains missiles 
 * 06/20/2018
 */

package defensevehicle;

public class Destroyer extends Ship {

	// Default number of missiles for destroyer to be used on parse integer of setNumberMissiles(String) 
	private static final int DEFAULT_MISSILES = 2;
	
	private static final int DEFAULT_LENGTH = 150;
	private static final int DEFAULT_SPEED = 60;
	private static final String DEFAULT_NAME = "A Default Destroyer";
	private static final String DEFAULT_TYPE = "Very Powerful";
	
	public Destroyer(int length, int speed, String name, String type, int missiles) {
		super(length, speed, name, type);
		setNumberMissiles(missiles);
	}
	
	public Destroyer() {
		this(DEFAULT_LENGTH, DEFAULT_SPEED, DEFAULT_NAME, DEFAULT_TYPE, DEFAULT_MISSILES);
	}

	private int numberMissiles;
	
	public int getNumberMissiles() {
		return numberMissiles;
	}

	public void setNumberMissiles(int numberMissiles) {
		if (numberMissiles < 0) {
			System.out.println("Number of missiles cannot be set to a negative number. No value will be set for the number of missiles.");
		} else {
			this.numberMissiles = numberMissiles;	
		}		
	}
	
	public void setNumberMissiles(String numberMissiles) {
		try {
			int parsedMissiles = Integer.parseInt(numberMissiles);
			setNumberMissiles(parsedMissiles);
		} catch (NumberFormatException nfe) {
			setNumberMissiles(DEFAULT_MISSILES);
			System.out.printf("The value %s is not a valid amount of missiles.  The value has beeen defaulted to %d.", numberMissiles, DEFAULT_MISSILES);
			System.out.println();
		}
	}
	
	@Override
	public String toString() {
		String formattedDetails = String.format("Destroyer Ship | Missiles: %d | %s ", getNumberMissiles(), super.toString());
		return formattedDetails;
	}	
}
