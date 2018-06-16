/**
 * Copyright © 2018
 * Steven Anderson
 * All rights reserved
 * 
 * Homework 4 - Defense Vehicles
 * Aircraft.java - Abstract Contact Model of an Aircraft Object
 * 06/20/2018
 */

package defensevehicle;

public abstract class Aircraft implements Contact {
	private static final int DEFAULT_SPEED = 0;
	private static final int DEFAULT_ALTITUDE = 0;
	
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
		if(length < 0) {
			System.out.println("Length cannot be set to a negative number. No value will be set for length.");
		} else {
			this.length = length;	
		}
	}
	
	private int speed;
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed < 0) {
			System.out.println("Speed cannot be set to a negative number. No value will be set for speed.");
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

	private int altitude;

	public int getAltitude() {
		return altitude;
	}

	public void setAltitude(int altitude) {
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
