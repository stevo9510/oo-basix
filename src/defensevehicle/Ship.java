/**
 * Copyright © 2018
 * Steven Anderson
 * All rights reserved
 * 
 * Homework 4 - Defense Vehicles
 * Ship.java - Abstract Contact Model of a Ship Object 
 * 06/20/2018
 */

package defensevehicle;

public abstract class Ship implements Contact {
	
	// Maximum speed (in knots) that can be set.  Anything past this would be very unrealistic (water speed record is <500 knots)
	public static final int MAX_SPEED = 10000;
	// Maximum length (in meters) that can be set for ship.  Anything past this would be very unrealistic (largest ship was 458 meters)
	public static final int MAX_LENGTH = 7500;
	
	public Ship(int length, int speed, String name, String type) {
		setLength(length);
		setSpeed(speed);
		setName(name);
		setType(type);
	}

	private int length;
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		if (length < 0) {
			System.out.println("Length cannot be set to a negative number. No value will be set for length.");
		} else if(length > MAX_LENGTH) {
			System.out.printf("Length of ship cannot be set larger than %d. No value will be set for length.", MAX_LENGTH);
			System.out.println();
		} else {
			this.length = length;	
		}		
	}
	
	private int speed;
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if (speed < 0) {
			System.out.println("Speed cannot be set to a negative number. No value will be set for speed.");
		} else if(speed > MAX_SPEED) {
			System.out.printf("Speed of ship cannot be set larger than %d. No value will be set for speed.", MAX_SPEED);
			System.out.println();
		} else {
			this.speed = speed;	
		}		
	}
	
	public void setSpeed(String speed) {
		try {
			int parsedSpeed = Integer.parseInt(speed);
			setSpeed(parsedSpeed);
		} catch (NumberFormatException nfe) {
			System.out.printf("Speed of %s is not an integer and cannot be used as a speed.  No speed has been set.", speed);
			System.out.println();
		}
	}
	
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	private String type;
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		String formattedShipDetails = String.format("Name: %s | Type: %s | Speed: %d knots | Length: %d meters | Base Contact Type: Ship | ", 
				getName(), getType(), getSpeed(), getLength());
		
		return formattedShipDetails;
	}
}
