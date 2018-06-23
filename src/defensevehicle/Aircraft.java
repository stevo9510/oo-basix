/**
 * Copyright 2018
 * Steven Anderson
 * All rights reserved
 * 
 * Homework 4 - Defense Vehicles
 * Aircraft.java - Abstract Contact Model of an Aircraft Object
 * 06/20/2018
 */

package defensevehicle;

public abstract class Aircraft implements Contact {
	// Maximum speed (in mph) that can be set.  Anything past this would be very unrealistic (fastest aircraft was ~2200 mph)
	public static final int MAX_SPEED = 20000;
	// Maximum length (in meters) that can be set for Aircraft.  Anything past this would be very unrealistic
	public static final int MAX_LENGTH = 500;
	
	public static final int DEFAULT_SPEED = 0;
	public static final int DEFAULT_ALTITUDE = 0;
	
	// Constructor used to set default speed/altitude without passing these in.
	// Calls into master constructor
	public Aircraft(int length, String name, String type) {
		this(length, DEFAULT_SPEED, name, type, DEFAULT_ALTITUDE);
	}
	
	public Aircraft(int length, int speed, String name, String type, int altitude) {
		setLength(length);
		setSpeed(speed);
		setName(name);
		setType(type);
		setAltitude(altitude);
	}
	
	private int length;
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		if (length < 0) {
			System.out.println("Length cannot be set to a negative number. No value will be set for length.");
		} else if(length > MAX_LENGTH) {
			System.out.printf("Length of aircraft cannot be set larger than %d. No value will be set for length.", MAX_LENGTH);
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
			System.out.printf("Speed of aircraft cannot be set larger than %d. No value will be set for speed.", MAX_SPEED);
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
			System.out.printf("Speed of %s is not an integer and cannot be used as a speed.  "
					+ "No speed has been set.", speed);
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

	private int altitude;

	public int getAltitude() {
		return altitude;
	}

	public void setAltitude(int altitude) {
		// There is no maximum altitude limit in case the Aircraft is a space shuttle :)
		if(altitude < 0) {
			System.out.println("Altitude cannot be set to a negative number. No value will be set for altitude.");
		} else {
			this.altitude = altitude;	
		}		
	}
	
	@Override
	public String toString() {
		String formattedAircraftDetails = String.format("Name: %s | Type: %s | Speed: %d mph | Length: %d meters | Altitude: %d meters | Base Contact Type: Aircraft | ", 
				getName(), getType(), getSpeed(), getLength(), getAltitude());
		
		return formattedAircraftDetails;
	}
}
