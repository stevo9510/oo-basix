/**
 * Copyright � 2018
 * Steven Anderson
 * All rights reserved
 * 
 * Homework 4 - Defense Vehicles
 * Submarine.java - Ship object that contains torpedos  
 * 06/20/2018
 */

package defensevehicle;

public class Submarine extends Ship {
	
	public Submarine(int length, int speed, String name, String type, int torpedos) {
		super(length, speed, name, type);
		setNumberTorpedos(torpedos);
	}

	private static final int DEFAULT_TORPEDOS = 2;
	
	private int numberTorpedos;

	public int getNumberTorpedos() {
		return numberTorpedos;
	}

	public void setNumberTorpedos(int numberTorpedos) {
		if(numberTorpedos < 0) {
			System.out.println("Number of torpedos cannot be set to a negative number. No value will be set for the number of torpedos.");
		} else {
			this.numberTorpedos = numberTorpedos;	
		}		
	} 
	
	public void setNumberTorpedos(String numberTorpedos) {
		try {
			int parsedTorpedos = Integer.parseInt(numberTorpedos);
			setNumberTorpedos(parsedTorpedos);
		} catch (NumberFormatException nfe) {
			this.numberTorpedos = DEFAULT_TORPEDOS;
			System.out.printf("The value %s is not a valid amount of torpedos.  The value has beeen defaulted to %d.", numberTorpedos, DEFAULT_TORPEDOS);
			System.out.println();
		}
	} 
	
	@Override
	public String toString() {
		String formattedDetails = String.format("Submarine Ship | Torpedos: %d | %s ", getNumberTorpedos(), super.toString());
		return formattedDetails;
	}	
}
