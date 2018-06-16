/**
 * Copyright © 2018
 * Steven Anderson
 * All rights reserved
 * 
 * Homework 4 - Defense Vehicles
 * Demo.java - Class that contains Main used to demonstrate other objects 
 * 06/20/2018
 */

package defensevehicle;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<Contact> contacts = new ArrayList<Contact>();
		List<Destroyer> destroyers = new ArrayList<Destroyer>();
		List<Ship> ships = new ArrayList<Ship>();
		List<Submarine> submarines = new ArrayList<Submarine>();
		
		// TODO: Coding standards?
		// Create 2 Destroyers
//		Create 2 Submarines
//		Create 2 P3s
//		Make a collection of Destroyers (you select the type of Collection)
//		Make a collection of Submarines (you select the type)
//		Make a collection that holds all Ships
//		Make a collection that holds all Contacts
//		Also, in your test class, you should exercise your execption handling case for the submarine by setting the number of torpedoes in one of your submarine classes to the string "Foo".
//		Note: Use defensive programming whenever you can, for example, none of your methods should let the user set the number of items to a negative number. 

		// Construct P3's and add to list
		P3 defaultP3 = new P3("EP-3");
		P3 aircraftInFlight = new P3(450, "CP-140", 1200);
				
		contacts.add(defaultP3);
		contacts.add(aircraftInFlight);
		
		Destroyer defaultDestroyer = new Destroyer();
		Destroyer userDefinedDestroyer = new Destroyer(50, 40, "Steven's Destroyer", "Not as Fast", 5);
		
		destroyers.add(defaultDestroyer);
		destroyers.add(userDefinedDestroyer);		
		
//		public Submarine(int length, int speed, String name, String type, int torpedos) {

		Submarine annapolisSubmarine = new Submarine(110, 25, "Annapolis", "SSN-760", 4);
		Submarine invalidSubmarine = new Submarine(-5, -2, "Bad values used", "Default Type", -5);
		invalidSubmarine.setNumberTorpedos("Foo");
				
		// Print out all contacts 
		for (Contact c : contacts) {
			System.out.println(c.toString());
		}
	}

}
