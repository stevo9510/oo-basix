/**
 * Copyright � 2018
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
	
	private static final int MAX_MISSILES = 5000;
	
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
			this.numberMissiles = DEFAULT_MISSILES;
			System.out.printf("Number of missiles cannot be set to a negative number of %d. The value will be defaulted to %d.", 
					numberMissiles, DEFAULT_MISSILES);
			System.out.println(); 
		} else if(numberMissiles > MAX_MISSILES) {
			this.numberMissiles = MAX_MISSILES;
			System.out.printf("Number of missiles cannot be set greater than %d. The value has been defaulted to the maximum amount.", MAX_MISSILES);
			System.out.println();
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
			System.out.printf("The value %s is not a valid amount of missiles.  The value has been defaulted to %d.", 
					numberMissiles, DEFAULT_MISSILES);
			System.out.println();
		}
	}
	
	@Override
	public String toString() {
		String formattedDetails = String.format("Destroyer Ship | Missiles: %d | %s ", getNumberMissiles(), super.toString());
		return formattedDetails;
	}	
}
