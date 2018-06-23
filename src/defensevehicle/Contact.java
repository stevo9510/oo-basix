/**
 * Copyright © 2018
 * Steven Anderson
 * All rights reserved
 * 
 * Homework 4 - Defense Vehicles
 * Contact.java - Interface for a Contact defect vehicle with basic getter/setters of attributes
 * 06/20/2018
 */

package defensevehicle;

public interface Contact {
	int getLength();
	void setLength(int length);
	
	int getSpeed();
	void setSpeed(int speed);
	
	void setSpeed(String speed);
	
	String getName();
	void setName(String name);
	
	String getType();
	void setType(String type);	
}
